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
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0128f, 21.9673f)
                lineTo(9.8633f, 22.7023f)
                lineTo(9.8633f, 22.7023f)
                lineTo(10.0128f, 21.9673f)
                close()
                moveTo(16.0342f, 20.4846f)
                curveTo(15.6622f, 20.6668f, 15.5084f, 21.116f, 15.6906f, 21.488f)
                curveTo(15.8728f, 21.86f, 16.3221f, 22.0138f, 16.6941f, 21.8316f)
                lineTo(16.0342f, 20.4846f)
                close()
                moveTo(10.1622f, 21.2324f)
                curveTo(5.9381f, 20.3736f, 2.75f, 16.6065f, 2.75f, 12.0832f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 17.3253f, 4.9458f, 21.7025f, 9.8633f, 22.7023f)
                lineTo(10.1622f, 21.2324f)
                close()
                moveTo(2.75f, 12.0832f)
                curveTo(2.75f, 6.9227f, 6.8972f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                curveTo(6.0571f, 1.25f, 1.25f, 6.1061f, 1.25f, 12.0832f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(17.1028f, 2.75f, 21.25f, 6.9227f, 21.25f, 12.0832f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 6.1061f, 17.9429f, 1.25f, 12.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(12.75f, 20.1498f)
                verticalLineTo(15.1082f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.1498f)
                horizontalLineTo(12.75f)
                close()
                moveTo(21.25f, 12.0832f)
                curveTo(21.25f, 15.7797f, 19.1208f, 18.9726f, 16.0342f, 20.4846f)
                lineTo(16.6941f, 21.8316f)
                curveTo(20.2798f, 20.0752f, 22.75f, 16.369f, 22.75f, 12.0832f)
                horizontalLineTo(21.25f)
                close()
                moveTo(9.8633f, 22.7023f)
                curveTo(11.5214f, 23.0394f, 12.75f, 21.618f, 12.75f, 20.1498f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 20.909f, 10.6697f, 21.3355f, 10.1622f, 21.2324f)
                lineTo(9.8633f, 22.7023f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 11.8f)
                curveTo(9.0f, 11.3582f, 9.3582f, 11.0f, 9.8f, 11.0f)
                horizontalLineTo(14.2f)
                curveTo(14.6418f, 11.0f, 15.0f, 11.3582f, 15.0f, 11.8f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                verticalLineTo(11.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 11.0f)
                verticalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 11.0f)
                verticalLineTo(9.0f)
            }
        }
            .build()
        return _plugCircle!!
    }

private var _plugCircle: ImageVector? = null
