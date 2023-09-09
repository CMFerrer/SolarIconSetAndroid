package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Diskette: ImageVector
    get() {
        if (_diskette != null) {
            return _diskette!!
        }
        _diskette = Builder(name = "Diskette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 11.6585f, 22.0f, 11.4878f, 21.9848f, 11.3142f)
                curveTo(21.9142f, 10.5049f, 21.586f, 9.7126f, 21.0637f, 9.0903f)
                curveTo(20.9516f, 8.9569f, 20.828f, 8.8332f, 20.5806f, 8.5858f)
                lineTo(15.4142f, 3.4194f)
                curveTo(15.1668f, 3.1721f, 15.0431f, 3.0484f, 14.9097f, 2.9363f)
                curveTo(14.2874f, 2.414f, 13.4951f, 2.0858f, 12.6858f, 2.0152f)
                curveTo(12.5122f, 2.0f, 12.3415f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.1485f, 21.2196f, 5.0273f, 21.5841f, 6.25f, 21.7784f)
                lineTo(7.75f, 21.9313f)
                curveTo(8.9058f, 22.0f, 10.2996f, 22.0f, 12.0f, 22.0f)
                curveTo(13.7004f, 22.0f, 15.0942f, 22.0f, 16.25f, 21.9313f)
                lineTo(17.75f, 21.7784f)
                curveTo(18.9727f, 21.5841f, 19.8515f, 21.2196f, 20.5355f, 20.5355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.25f)
                curveTo(6.5858f, 7.25f, 6.25f, 7.5858f, 6.25f, 8.0f)
                curveTo(6.25f, 8.4142f, 6.5858f, 8.75f, 7.0f, 8.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 8.75f, 13.75f, 8.4142f, 13.75f, 8.0f)
                curveTo(13.75f, 7.5858f, 13.4142f, 7.25f, 13.0f, 7.25f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.052f, 16.25f)
                curveTo(13.9505f, 16.25f, 14.6997f, 16.2499f, 15.2945f, 16.3299f)
                curveTo(15.9223f, 16.4143f, 16.4891f, 16.6f, 16.9445f, 17.0555f)
                curveTo(17.4f, 17.5109f, 17.5857f, 18.0777f, 17.6701f, 18.7055f)
                curveTo(17.7501f, 19.3003f, 17.75f, 20.0495f, 17.75f, 20.948f)
                verticalLineTo(20.948f)
                lineTo(17.75f, 21.7812f)
                lineTo(16.25f, 21.9219f)
                verticalLineTo(21.0f)
                curveTo(16.25f, 20.036f, 16.2484f, 19.3884f, 16.1835f, 18.9054f)
                curveTo(16.1214f, 18.4439f, 16.0142f, 18.2464f, 15.8839f, 18.1161f)
                curveTo(15.7536f, 17.9858f, 15.5561f, 17.8786f, 15.0946f, 17.8165f)
                curveTo(14.6116f, 17.7516f, 13.964f, 17.75f, 13.0f, 17.75f)
                horizontalLineTo(11.0f)
                curveTo(10.036f, 17.75f, 9.3884f, 17.7516f, 8.9054f, 17.8165f)
                curveTo(8.4439f, 17.8786f, 8.2464f, 17.9858f, 8.1161f, 18.1161f)
                curveTo(7.9858f, 18.2464f, 7.8786f, 18.4439f, 7.8165f, 18.9054f)
                curveTo(7.7516f, 19.3884f, 7.75f, 20.036f, 7.75f, 21.0f)
                verticalLineTo(21.9258f)
                lineTo(6.25f, 21.7773f)
                lineTo(6.25f, 20.948f)
                verticalLineTo(20.948f)
                curveTo(6.25f, 20.0495f, 6.2499f, 19.3003f, 6.3299f, 18.7055f)
                curveTo(6.4143f, 18.0777f, 6.6f, 17.5109f, 7.0555f, 17.0555f)
                curveTo(7.5109f, 16.6f, 8.0777f, 16.4143f, 8.7055f, 16.3299f)
                curveTo(9.3003f, 16.2499f, 10.0495f, 16.25f, 10.948f, 16.25f)
                horizontalLineTo(10.948f)
                horizontalLineTo(13.052f)
                horizontalLineTo(13.052f)
                close()
            }
        }
        .build()
        return _diskette!!
    }

private var _diskette: ImageVector? = null
