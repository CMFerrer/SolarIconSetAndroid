package com.chiksmedina.solar.lineduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SecurityGroup

public val SecurityGroup.QrCode: ImageVector
    get() {
        if (_qrCode != null) {
            return _qrCode!!
        }
        _qrCode = Builder(name = "QrCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.9f)
                curveTo(2.0f, 15.5906f, 2.0f, 14.9359f, 2.2947f, 14.455f)
                curveTo(2.4596f, 14.1859f, 2.6859f, 13.9596f, 2.955f, 13.7947f)
                curveTo(3.4359f, 13.5f, 4.0906f, 13.5f, 5.4f, 13.5f)
                horizontalLineTo(6.5f)
                curveTo(8.3856f, 13.5f, 9.3284f, 13.5f, 9.9142f, 14.0858f)
                curveTo(10.5f, 14.6716f, 10.5f, 15.6144f, 10.5f, 17.5f)
                verticalLineTo(18.6f)
                curveTo(10.5f, 19.9094f, 10.5f, 20.5641f, 10.2053f, 21.045f)
                curveTo(10.0404f, 21.3141f, 9.8141f, 21.5404f, 9.545f, 21.7053f)
                curveTo(9.0641f, 22.0f, 8.4094f, 22.0f, 7.1f, 22.0f)
                curveTo(5.1359f, 22.0f, 4.1539f, 22.0f, 3.4325f, 21.5579f)
                curveTo(3.0288f, 21.3106f, 2.6895f, 20.9712f, 2.4421f, 20.5675f)
                curveTo(2.0f, 19.8461f, 2.0f, 18.8641f, 2.0f, 16.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 5.4f)
                curveTo(13.5f, 4.0906f, 13.5f, 3.4359f, 13.7947f, 2.955f)
                curveTo(13.9596f, 2.6859f, 14.1859f, 2.4596f, 14.455f, 2.2947f)
                curveTo(14.9359f, 2.0f, 15.5906f, 2.0f, 16.9f, 2.0f)
                curveTo(18.8641f, 2.0f, 19.8461f, 2.0f, 20.5675f, 2.4421f)
                curveTo(20.9712f, 2.6895f, 21.3106f, 3.0288f, 21.5579f, 3.4325f)
                curveTo(22.0f, 4.1539f, 22.0f, 5.1359f, 22.0f, 7.1f)
                curveTo(22.0f, 8.4094f, 22.0f, 9.0641f, 21.7053f, 9.545f)
                curveTo(21.5404f, 9.8141f, 21.3141f, 10.0404f, 21.045f, 10.2053f)
                curveTo(20.5641f, 10.5f, 19.9094f, 10.5f, 18.6f, 10.5f)
                horizontalLineTo(17.5f)
                curveTo(15.6144f, 10.5f, 14.6716f, 10.5f, 14.0858f, 9.9142f)
                curveTo(13.5f, 9.3284f, 13.5f, 8.3856f, 13.5f, 6.5f)
                verticalLineTo(5.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 6.25f)
                curveTo(16.5f, 5.7346f, 16.5f, 5.4769f, 16.6291f, 5.2949f)
                curveTo(16.6747f, 5.2307f, 16.7307f, 5.1747f, 16.7949f, 5.1291f)
                curveTo(16.9769f, 5.0f, 17.2346f, 5.0f, 17.75f, 5.0f)
                curveTo(18.2654f, 5.0f, 18.5231f, 5.0f, 18.7051f, 5.1291f)
                curveTo(18.7693f, 5.1747f, 18.8253f, 5.2307f, 18.8709f, 5.2949f)
                curveTo(19.0f, 5.4769f, 19.0f, 5.7346f, 19.0f, 6.25f)
                curveTo(19.0f, 6.7654f, 19.0f, 7.0231f, 18.8709f, 7.2051f)
                curveTo(18.8253f, 7.2693f, 18.7693f, 7.3253f, 18.7051f, 7.3709f)
                curveTo(18.5231f, 7.5f, 18.2654f, 7.5f, 17.75f, 7.5f)
                curveTo(17.2346f, 7.5f, 16.9769f, 7.5f, 16.7949f, 7.3709f)
                curveTo(16.7307f, 7.3253f, 16.6747f, 7.2693f, 16.6291f, 7.2051f)
                curveTo(16.5f, 7.0231f, 16.5f, 6.7654f, 16.5f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 13.5f)
                horizontalLineTo(17.0f)
                curveTo(15.5955f, 13.5f, 14.8933f, 13.5f, 14.3889f, 13.8371f)
                curveTo(14.1705f, 13.983f, 13.983f, 14.1705f, 13.8371f, 14.3889f)
                curveTo(13.5f, 14.8933f, 13.5f, 15.5955f, 13.5f, 17.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 22.0f)
                curveTo(12.75f, 22.4142f, 13.0858f, 22.75f, 13.5f, 22.75f)
                curveTo(13.9142f, 22.75f, 14.25f, 22.4142f, 14.25f, 22.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.25f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(19.9319f, 22.0f, 20.3978f, 22.0f, 20.7654f, 21.8478f)
                curveTo(21.2554f, 21.6448f, 21.6448f, 21.2554f, 21.8478f, 20.7654f)
                curveTo(22.0f, 20.3978f, 22.0f, 19.9319f, 22.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.75f, 13.5f)
                curveTo(22.75f, 13.0858f, 22.4142f, 12.75f, 22.0f, 12.75f)
                curveTo(21.5858f, 12.75f, 21.25f, 13.0858f, 21.25f, 13.5f)
                horizontalLineTo(22.75f)
                close()
                moveTo(22.75f, 17.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(21.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.1f)
                curveTo(2.0f, 5.1359f, 2.0f, 4.1539f, 2.4421f, 3.4325f)
                curveTo(2.6895f, 3.0288f, 3.0288f, 2.6895f, 3.4325f, 2.4421f)
                curveTo(4.1539f, 2.0f, 5.1359f, 2.0f, 7.1f, 2.0f)
                curveTo(8.4094f, 2.0f, 9.0641f, 2.0f, 9.545f, 2.2947f)
                curveTo(9.8141f, 2.4596f, 10.0404f, 2.6859f, 10.2053f, 2.955f)
                curveTo(10.5f, 3.4359f, 10.5f, 4.0906f, 10.5f, 5.4f)
                verticalLineTo(6.5f)
                curveTo(10.5f, 8.3856f, 10.5f, 9.3284f, 9.9142f, 9.9142f)
                curveTo(9.3284f, 10.5f, 8.3856f, 10.5f, 6.5f, 10.5f)
                horizontalLineTo(5.4f)
                curveTo(4.0906f, 10.5f, 3.4359f, 10.5f, 2.955f, 10.2053f)
                curveTo(2.6859f, 10.0404f, 2.4596f, 9.8141f, 2.2947f, 9.545f)
                curveTo(2.0f, 9.0641f, 2.0f, 8.4094f, 2.0f, 7.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.25f)
                curveTo(5.0f, 5.7346f, 5.0f, 5.4769f, 5.1291f, 5.2949f)
                curveTo(5.1747f, 5.2307f, 5.2307f, 5.1747f, 5.2949f, 5.1291f)
                curveTo(5.4769f, 5.0f, 5.7346f, 5.0f, 6.25f, 5.0f)
                curveTo(6.7654f, 5.0f, 7.0231f, 5.0f, 7.2051f, 5.1291f)
                curveTo(7.2693f, 5.1747f, 7.3253f, 5.2307f, 7.3709f, 5.2949f)
                curveTo(7.5f, 5.4769f, 7.5f, 5.7346f, 7.5f, 6.25f)
                curveTo(7.5f, 6.7654f, 7.5f, 7.0231f, 7.3709f, 7.2051f)
                curveTo(7.3253f, 7.2693f, 7.2693f, 7.3253f, 7.2051f, 7.3709f)
                curveTo(7.0231f, 7.5f, 6.7654f, 7.5f, 6.25f, 7.5f)
                curveTo(5.7346f, 7.5f, 5.4769f, 7.5f, 5.2949f, 7.3709f)
                curveTo(5.2307f, 7.3253f, 5.1747f, 7.2693f, 5.1291f, 7.2051f)
                curveTo(5.0f, 7.0231f, 5.0f, 6.7654f, 5.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.75f)
                curveTo(5.0f, 17.2346f, 5.0f, 16.9769f, 5.1291f, 16.7949f)
                curveTo(5.1747f, 16.7307f, 5.2307f, 16.6747f, 5.2949f, 16.6291f)
                curveTo(5.4769f, 16.5f, 5.7346f, 16.5f, 6.25f, 16.5f)
                curveTo(6.7654f, 16.5f, 7.0231f, 16.5f, 7.2051f, 16.6291f)
                curveTo(7.2693f, 16.6747f, 7.3253f, 16.7307f, 7.3709f, 16.7949f)
                curveTo(7.5f, 16.9769f, 7.5f, 17.2346f, 7.5f, 17.75f)
                curveTo(7.5f, 18.2654f, 7.5f, 18.5231f, 7.3709f, 18.7051f)
                curveTo(7.3253f, 18.7693f, 7.2693f, 18.8253f, 7.2051f, 18.8709f)
                curveTo(7.0231f, 19.0f, 6.7654f, 19.0f, 6.25f, 19.0f)
                curveTo(5.7346f, 19.0f, 5.4769f, 19.0f, 5.2949f, 18.8709f)
                curveTo(5.2307f, 18.8253f, 5.1747f, 18.7693f, 5.1291f, 18.7051f)
                curveTo(5.0f, 18.5231f, 5.0f, 18.2654f, 5.0f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.75f)
                curveTo(16.0f, 17.0478f, 16.0f, 16.6967f, 16.1685f, 16.4444f)
                curveTo(16.2415f, 16.3352f, 16.3352f, 16.2415f, 16.4444f, 16.1685f)
                curveTo(16.6967f, 16.0f, 17.0478f, 16.0f, 17.75f, 16.0f)
                curveTo(18.4522f, 16.0f, 18.8033f, 16.0f, 19.0556f, 16.1685f)
                curveTo(19.1648f, 16.2415f, 19.2585f, 16.3352f, 19.3315f, 16.4444f)
                curveTo(19.5f, 16.6967f, 19.5f, 17.0478f, 19.5f, 17.75f)
                curveTo(19.5f, 18.4522f, 19.5f, 18.8033f, 19.3315f, 19.0556f)
                curveTo(19.2585f, 19.1648f, 19.1648f, 19.2585f, 19.0556f, 19.3315f)
                curveTo(18.8033f, 19.5f, 18.4522f, 19.5f, 17.75f, 19.5f)
                curveTo(17.0478f, 19.5f, 16.6967f, 19.5f, 16.4444f, 19.3315f)
                curveTo(16.3352f, 19.2585f, 16.2415f, 19.1648f, 16.1685f, 19.0556f)
                curveTo(16.0f, 18.8033f, 16.0f, 18.4522f, 16.0f, 17.75f)
                close()
            }
        }
        .build()
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
