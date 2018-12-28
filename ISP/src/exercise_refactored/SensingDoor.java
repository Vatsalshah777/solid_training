package exercise_refactored;

import com.meditab.training.isp.exercise.Door;
import com.meditab.training.isp.exercise.Sensor;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor implements Door , timed_door
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    @Override
    public void timeOutCallback()
    {
        throw new NotImplementedException();
    }

    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}