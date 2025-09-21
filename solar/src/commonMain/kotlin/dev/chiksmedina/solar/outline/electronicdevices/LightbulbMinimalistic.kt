package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.LightbulbMinimalistic: ImageVector
    get() {
        if (_lightbulbMinimalistic != null) {
            return _lightbulbMinimalistic!!
        }
        _lightbulbMinimalistic = Builder(
            name = "LightbulbMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 19.5f)
                curveTo(9.25f, 19.0858f, 9.5858f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 18.75f, 14.75f, 19.0858f, 14.75f, 19.5f)
                curveTo(14.75f, 19.9142f, 14.4142f, 20.25f, 14.0f, 20.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 20.25f, 9.25f, 19.9142f, 9.25f, 19.5f)
                close()
                moveTo(9.9167f, 22.0f)
                curveTo(9.9167f, 21.5858f, 10.2525f, 21.25f, 10.6667f, 21.25f)
                horizontalLineTo(13.3333f)
                curveTo(13.7475f, 21.25f, 14.0833f, 21.5858f, 14.0833f, 22.0f)
                curveTo(14.0833f, 22.4142f, 13.7475f, 22.75f, 13.3333f, 22.75f)
                horizontalLineTo(10.6667f)
                curveTo(10.2525f, 22.75f, 9.9167f, 22.4142f, 9.9167f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 8.2181f)
                curveTo(4.25f, 4.3133f, 7.8039f, 1.25f, 12.0f, 1.25f)
                curveTo(16.1961f, 1.25f, 19.75f, 4.3133f, 19.75f, 8.2181f)
                lineTo(19.75f, 8.2213f)
                curveTo(19.7404f, 10.4277f, 18.7914f, 12.6257f, 17.1055f, 14.2246f)
                lineTo(17.1035f, 14.2266f)
                lineTo(15.9994f, 15.2658f)
                curveTo(15.8403f, 15.4156f, 15.75f, 15.6245f, 15.75f, 15.843f)
                curveTo(15.75f, 16.8962f, 14.8962f, 17.75f, 13.843f, 17.75f)
                horizontalLineTo(10.157f)
                curveTo(9.1038f, 17.75f, 8.25f, 16.8962f, 8.25f, 15.843f)
                curveTo(8.25f, 15.6245f, 8.1598f, 15.4156f, 8.0006f, 15.2658f)
                lineTo(6.8965f, 14.2266f)
                lineTo(6.8945f, 14.2246f)
                curveTo(5.2086f, 12.6257f, 4.2596f, 10.4277f, 4.25f, 8.2213f)
                lineTo(4.25f, 8.2181f)
                close()
                moveTo(5.75f, 8.2164f)
                curveTo(5.7582f, 10.002f, 6.5302f, 11.8113f, 7.9257f, 13.1353f)
                curveTo(7.926f, 13.1356f, 7.9264f, 13.136f, 7.9267f, 13.1363f)
                lineTo(9.0287f, 14.1735f)
                curveTo(9.489f, 14.6068f, 9.75f, 15.2109f, 9.75f, 15.843f)
                curveTo(9.75f, 16.0678f, 9.9322f, 16.25f, 10.157f, 16.25f)
                horizontalLineTo(13.843f)
                curveTo(14.0678f, 16.25f, 14.25f, 16.0678f, 14.25f, 15.843f)
                curveTo(14.25f, 15.2109f, 14.511f, 14.6068f, 14.9713f, 14.1735f)
                curveTo(14.9713f, 14.1735f, 14.9713f, 14.1735f, 14.9713f, 14.1735f)
                lineTo(16.0733f, 13.1363f)
                curveTo(16.0736f, 13.136f, 16.074f, 13.1357f, 16.0743f, 13.1354f)
                curveTo(17.4698f, 11.8113f, 18.2418f, 10.002f, 18.25f, 8.2164f)
                curveTo(18.2489f, 5.2995f, 15.5352f, 2.75f, 12.0f, 2.75f)
                curveTo(8.4648f, 2.75f, 5.751f, 5.2995f, 5.75f, 8.2164f)
                close()
            }
        }
            .build()
        return _lightbulbMinimalistic!!
    }

private var _lightbulbMinimalistic: ImageVector? = null
