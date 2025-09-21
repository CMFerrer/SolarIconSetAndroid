package dev.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SsdRound: ImageVector
    get() {
        if (_ssdRound != null) {
            return _ssdRound!!
        }
        _ssdRound = Builder(
            name = "SsdRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.5534f, 15.4813f)
                lineTo(19.0f, 5.1177f)
                curveTo(18.5f, 3.5294f, 17.6046f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(7.5f)
                curveTo(6.3954f, 3.0f, 5.5f, 3.5294f, 5.0f, 5.1177f)
                lineTo(2.4466f, 15.4813f)
                moveTo(21.5534f, 15.4813f)
                curveTo(20.9538f, 14.3515f, 19.8111f, 13.5882f, 18.5f, 13.5882f)
                horizontalLineTo(5.5f)
                curveTo(4.1889f, 13.5882f, 3.0462f, 14.3515f, 2.4466f, 15.4813f)
                moveTo(21.5534f, 15.4813f)
                curveTo(21.8378f, 16.0172f, 22.0f, 16.6356f, 22.0f, 17.2941f)
                curveTo(22.0f, 19.3408f, 20.433f, 21.0f, 18.5f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(3.567f, 21.0f, 2.0f, 19.3408f, 2.0f, 17.2941f)
                curveTo(2.0f, 16.6356f, 2.1622f, 16.0172f, 2.4466f, 15.4813f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 17.0f)
                verticalLineTo(18.0f)
            }
        }
            .build()
        return _ssdRound!!
    }

private var _ssdRound: ImageVector? = null
