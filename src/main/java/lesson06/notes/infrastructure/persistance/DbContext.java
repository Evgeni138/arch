package lesson06.notes.infrastructure.persistance;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder modelBuilder);

    public boolean saveChanges() {
        //TODO: Сохранение изменеий в БД
        return true;
    }
}

class ModelBuilder {

    public ModelBuilder applyConfiguration(ModelConfiguration modelConfiguration) {
        //TODO: Добавление конфигурации маппинга объекта некоторого типа к стркуктуре таблицы БД
        return this;
    }

}
