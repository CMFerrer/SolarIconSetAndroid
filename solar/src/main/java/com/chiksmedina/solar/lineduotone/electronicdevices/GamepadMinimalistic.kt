package com.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.GamepadMinimalistic: ImageVector
    get() {
        if (_gamepadMinimalistic != null) {
            return _gamepadMinimalistic!!
        }
        _gamepadMinimalistic = Builder(name = "GamepadMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 11.0f)
                verticalLineTo(14.0f)
                moveTo(7.0f, 12.5f)
                lineTo(10.0f, 12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9197f, 17.3766f)
                lineTo(20.8349f, 12.8603f)
                curveTo(20.2216f, 10.3074f, 19.915f, 9.0309f, 19.0453f, 8.1937f)
                curveTo(18.8251f, 7.9818f, 18.5819f, 7.794f, 18.3198f, 7.6337f)
                curveTo(17.2841f, 7.0f, 15.9371f, 7.0f, 13.2432f, 7.0f)
                horizontalLineTo(10.7568f)
                curveTo(8.0629f, 7.0f, 6.7159f, 7.0f, 5.6802f, 7.6337f)
                curveTo(5.4181f, 7.794f, 5.1749f, 7.9818f, 4.9547f, 8.1937f)
                curveTo(4.085f, 9.0309f, 3.7784f, 10.3074f, 3.1651f, 12.8603f)
                lineTo(2.0803f, 17.3766f)
                curveTo(1.6989f, 18.9643f, 2.7127f, 20.552f, 4.3441f, 20.9225f)
                curveTo(5.72f, 21.2349f, 7.1352f, 20.5814f, 7.7566f, 19.3466f)
                lineTo(7.8846f, 19.0923f)
                curveTo(8.4552f, 17.9586f, 9.6392f, 17.2399f, 10.9364f, 17.2399f)
                horizontalLineTo(13.0636f)
                curveTo(14.3608f, 17.2399f, 15.5448f, 17.9586f, 16.1154f, 19.0923f)
                lineTo(16.2434f, 19.3466f)
                curveTo(16.8648f, 20.5814f, 18.28f, 21.2349f, 19.6559f, 20.9225f)
                curveTo(21.2873f, 20.552f, 22.3011f, 18.9643f, 21.9197f, 17.3766f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(12.0f, 5.4477f, 12.4477f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 5.0f, 15.0f, 4.5523f, 15.0f, 4.0f)
                verticalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                curveTo(16.0f, 11.5523f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.5523f, 14.0f, 11.0f)
                curveTo(14.0f, 10.4477f, 14.4477f, 10.0f, 15.0f, 10.0f)
                curveTo(15.5523f, 10.0f, 16.0f, 10.4477f, 16.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 14.5523f, 17.5523f, 15.0f, 17.0f, 15.0f)
                curveTo(16.4477f, 15.0f, 16.0f, 14.5523f, 16.0f, 14.0f)
                curveTo(16.0f, 13.4477f, 16.4477f, 13.0f, 17.0f, 13.0f)
                curveTo(17.5523f, 13.0f, 18.0f, 13.4477f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _gamepadMinimalistic!!
    }

private var _gamepadMinimalistic: ImageVector? = null
