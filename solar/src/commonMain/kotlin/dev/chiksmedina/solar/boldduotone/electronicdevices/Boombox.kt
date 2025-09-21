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

val ElectronicDevicesGroup.Boombox: ImageVector
    get() {
        if (_boombox != null) {
            return _boombox!!
        }
        _boombox = Builder(
            name = "Boombox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.25f, 9.5f)
                curveTo(5.25f, 9.0858f, 5.5858f, 8.75f, 6.0f, 8.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 8.75f, 18.75f, 9.0858f, 18.75f, 9.5f)
                curveTo(18.75f, 9.9142f, 18.4142f, 10.25f, 18.0f, 10.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 10.25f, 5.25f, 9.9142f, 5.25f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.948f, 1.25f)
                horizontalLineTo(12.052f)
                curveTo(12.9505f, 1.25f, 13.6997f, 1.25f, 14.2945f, 1.3299f)
                curveTo(14.9223f, 1.4143f, 15.4891f, 1.6f, 15.9445f, 2.0555f)
                curveTo(16.4f, 2.5109f, 16.5857f, 3.0777f, 16.6701f, 3.7055f)
                curveTo(16.7501f, 4.3003f, 16.75f, 5.0495f, 16.75f, 5.948f)
                lineTo(16.75f, 6.0f)
                horizontalLineTo(15.25f)
                curveTo(15.25f, 5.036f, 15.2484f, 4.3884f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.7516f, 4.3884f, 8.75f, 5.036f, 8.75f, 6.0f)
                horizontalLineTo(7.25f)
                lineTo(7.25f, 5.948f)
                curveTo(7.25f, 5.0495f, 7.2499f, 4.3003f, 7.3299f, 3.7055f)
                curveTo(7.4143f, 3.0777f, 7.6f, 2.5109f, 8.0555f, 2.0555f)
                curveTo(8.5109f, 1.6f, 9.0777f, 1.4143f, 9.7055f, 1.3299f)
                curveTo(10.3003f, 1.25f, 11.0495f, 1.25f, 11.948f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.25f, 13.0947f)
                curveTo(5.9561f, 13.4278f, 5.0f, 14.6023f, 5.0f, 16.0002f)
                curveTo(5.0f, 17.6571f, 6.3432f, 19.0002f, 8.0f, 19.0002f)
                curveTo(9.6568f, 19.0002f, 11.0f, 17.6571f, 11.0f, 16.0002f)
                curveTo(11.0f, 14.6023f, 10.0439f, 13.4278f, 8.75f, 13.0947f)
                verticalLineTo(15.0002f)
                curveTo(8.75f, 15.4144f, 8.4142f, 15.7502f, 8.0f, 15.7502f)
                curveTo(7.5858f, 15.7502f, 7.25f, 15.4144f, 7.25f, 15.0002f)
                verticalLineTo(13.0947f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.8787f, 18.1213f)
                curveTo(15.0503f, 19.2929f, 16.9497f, 19.2929f, 18.1213f, 18.1213f)
                curveTo(19.1098f, 17.1329f, 19.2643f, 15.6263f, 18.5848f, 14.4758f)
                lineTo(17.2372f, 15.8234f)
                curveTo(16.9443f, 16.1163f, 16.4694f, 16.1163f, 16.1765f, 15.8234f)
                curveTo(15.8837f, 15.5306f, 15.8837f, 15.0557f, 16.1765f, 14.7628f)
                lineTo(17.5242f, 13.4152f)
                curveTo(16.3737f, 12.7357f, 14.8671f, 12.8902f, 13.8787f, 13.8787f)
                curveTo(12.7071f, 15.0503f, 12.7071f, 16.9497f, 13.8787f, 18.1213f)
                close()
            }
        }
            .build()
        return _boombox!!
    }

private var _boombox: ImageVector? = null
