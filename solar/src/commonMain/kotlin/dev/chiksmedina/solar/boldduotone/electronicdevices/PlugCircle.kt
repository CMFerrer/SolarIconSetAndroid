package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.PlugCircle: ImageVector
    get() {
        if (_plugCircle != null) {
            return _plugCircle!!
        }
        _plugCircle = Builder(
            name = "PlugCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.7497f, 22.0f)
                curveTo(17.9224f, 21.6161f, 22.0f, 17.2918f, 22.0f, 12.0139f)
                lineTo(22.0f, 12.0069f)
                lineTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                lineTo(2.0f, 12.0069f)
                lineTo(2.0f, 12.0139f)
                curveTo(2.0f, 17.2918f, 6.0776f, 21.6161f, 11.2503f, 22.0f)
                lineTo(11.2503f, 21.9723f)
                curveTo(6.0799f, 21.5891f, 2.0036f, 17.2744f, 2.0f, 12.0069f)
                curveTo(2.0037f, 6.4796f, 6.4795f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5205f, 2.0f, 21.9963f, 6.4796f, 22.0f, 12.0069f)
                curveTo(21.9964f, 17.2744f, 17.9201f, 21.5891f, 12.7497f, 21.9723f)
                lineTo(12.7497f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.2503f, 21.9723f)
                curveTo(11.4978f, 21.9907f, 11.7478f, 22.0f, 12.0f, 22.0f)
                curveTo(12.2522f, 22.0f, 12.5022f, 21.9907f, 12.7497f, 21.9723f)
                curveTo(17.9201f, 21.5891f, 21.9964f, 17.2744f, 22.0f, 12.0069f)
                curveTo(21.9963f, 6.4796f, 17.5205f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4795f, 2.0f, 2.0037f, 6.4796f, 2.0f, 12.0069f)
                curveTo(2.0036f, 17.2744f, 6.0799f, 21.5891f, 11.2503f, 21.9723f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5f, 12.5147f)
                curveTo(8.5f, 14.1925f, 9.6774f, 15.595f, 11.2499f, 15.9389f)
                lineTo(11.2503f, 21.9724f)
                curveTo(11.4978f, 21.9908f, 11.7478f, 22.0001f, 12.0f, 22.0001f)
                curveTo(12.2522f, 22.0001f, 12.5022f, 21.9908f, 12.7497f, 21.9724f)
                lineTo(12.7499f, 15.9389f)
                curveTo(14.3226f, 15.5951f, 15.5f, 14.1926f, 15.5f, 12.5147f)
                verticalLineTo(12.014f)
                curveTo(15.5f, 11.4609f, 15.0523f, 11.0126f, 14.5f, 11.0126f)
                horizontalLineTo(14.25f)
                verticalLineTo(9.0098f)
                curveTo(14.25f, 8.595f, 13.9142f, 8.2588f, 13.5f, 8.2588f)
                curveTo(13.0858f, 8.2588f, 12.75f, 8.595f, 12.75f, 9.0098f)
                verticalLineTo(11.0126f)
                horizontalLineTo(11.25f)
                verticalLineTo(9.0098f)
                curveTo(11.25f, 8.595f, 10.9142f, 8.2588f, 10.5f, 8.2588f)
                curveTo(10.0858f, 8.2588f, 9.75f, 8.595f, 9.75f, 9.0098f)
                verticalLineTo(11.0126f)
                horizontalLineTo(9.5f)
                curveTo(8.9477f, 11.0126f, 8.5f, 11.4609f, 8.5f, 12.014f)
                verticalLineTo(12.5147f)
                close()
            }
        }
            .build()
        return _plugCircle!!
    }

private var _plugCircle: ImageVector? = null
