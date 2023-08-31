package lesson01.store3d.inmemory;

public interface IModelChanger {
    /**
     * Произошло изменение в хранилище моделей
     */

    void notifyChangePolygon();

    void notifyChangeFlash();

    void notifyChangeCamera();

    void notifyChangeScene();


    void RegisterModelChanger(ModelChangedObserver o);

    void RemoveModelChanger(ModelChangedObserver o);
}
