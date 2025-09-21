package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.GamepadOld: ImageVector
    get() {
        if (_gamepadOld != null) {
            return _gamepadOld!!
        }
        _gamepadOld = Builder(
            name = "GamepadOld", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.75f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(11.25f)
                horizontalLineTo(12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.75f, 12.0f)
                curveTo(8.75f, 11.5858f, 8.4142f, 11.25f, 8.0f, 11.25f)
                curveTo(7.5858f, 11.25f, 7.25f, 11.5858f, 7.25f, 12.0f)
                verticalLineTo(13.05f)
                curveTo(7.25f, 13.1605f, 7.1605f, 13.25f, 7.05f, 13.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 13.25f, 5.25f, 13.5858f, 5.25f, 14.0f)
                curveTo(5.25f, 14.4142f, 5.5858f, 14.75f, 6.0f, 14.75f)
                horizontalLineTo(7.05f)
                curveTo(7.1605f, 14.75f, 7.25f, 14.8395f, 7.25f, 14.95f)
                verticalLineTo(16.0f)
                curveTo(7.25f, 16.4142f, 7.5858f, 16.75f, 8.0f, 16.75f)
                curveTo(8.4142f, 16.75f, 8.75f, 16.4142f, 8.75f, 16.0f)
                verticalLineTo(14.95f)
                curveTo(8.75f, 14.8395f, 8.8395f, 14.75f, 8.95f, 14.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 14.75f, 10.75f, 14.4142f, 10.75f, 14.0f)
                curveTo(10.75f, 13.5858f, 10.4142f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(8.95f)
                curveTo(8.8395f, 13.25f, 8.75f, 13.1605f, 8.75f, 13.05f)
                verticalLineTo(12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 13.5f)
                curveTo(15.5523f, 13.5f, 16.0f, 13.0523f, 16.0f, 12.5f)
                curveTo(16.0f, 11.9477f, 15.5523f, 11.5f, 15.0f, 11.5f)
                curveTo(14.4477f, 11.5f, 14.0f, 11.9477f, 14.0f, 12.5f)
                curveTo(14.0f, 13.0523f, 14.4477f, 13.5f, 15.0f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 15.5f)
                curveTo(18.0f, 16.0523f, 17.5523f, 16.5f, 17.0f, 16.5f)
                curveTo(16.4477f, 16.5f, 16.0f, 16.0523f, 16.0f, 15.5f)
                curveTo(16.0f, 14.9477f, 16.4477f, 14.5f, 17.0f, 14.5f)
                curveTo(17.5523f, 14.5f, 18.0f, 14.9477f, 18.0f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.75f, 2.0f)
                curveTo(15.75f, 1.5858f, 15.4142f, 1.25f, 15.0f, 1.25f)
                curveTo(14.5858f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(14.25f, 3.1381f, 14.1381f, 3.25f, 14.0f, 3.25f)
                horizontalLineTo(13.0f)
                curveTo(12.0335f, 3.25f, 11.25f, 4.0335f, 11.25f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.0f)
                curveTo(12.75f, 4.8619f, 12.8619f, 4.75f, 13.0f, 4.75f)
                horizontalLineTo(14.0f)
                curveTo(14.9665f, 4.75f, 15.75f, 3.9665f, 15.75f, 3.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
            .build()
        return _gamepadOld!!
    }

private var _gamepadOld: ImageVector? = null
