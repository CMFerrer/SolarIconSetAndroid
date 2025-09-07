package com.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Volleyball2: ImageVector
    get() {
        if (_volleyball2 != null) {
            return _volleyball2!!
        }
        _volleyball2 = Builder(
            name = "Volleyball2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.756f, 13.3257f)
                lineTo(12.0171f, 12.9934f)
                curveTo(15.365f, 13.0728f, 18.4787f, 14.694f, 20.4402f, 17.3653f)
                curveTo(18.6653f, 20.1517f, 15.5485f, 21.9999f, 12.0f, 21.9999f)
                curveTo(10.7177f, 21.9999f, 9.4918f, 21.7585f, 8.3652f, 21.3188f)
                curveTo(10.9132f, 20.7501f, 13.3607f, 19.6436f, 15.4931f, 18.1493f)
                curveTo(15.8324f, 17.9116f, 15.9146f, 17.4439f, 15.6769f, 17.1047f)
                curveTo(15.4392f, 16.7655f, 14.9715f, 16.6832f, 14.6323f, 16.9209f)
                curveTo(12.1358f, 18.6704f, 9.1927f, 19.8336f, 6.215f, 20.1577f)
                curveTo(5.3356f, 19.533f, 4.5616f, 18.7696f, 3.9248f, 17.8994f)
                curveTo(7.0023f, 17.4192f, 9.8119f, 15.7992f, 11.756f, 13.3257f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.7467f, 12.1824f)
                lineTo(10.5766f, 12.3988f)
                curveTo(8.7392f, 14.7366f, 6.0175f, 16.2093f, 3.0658f, 16.4969f)
                curveTo(2.384f, 15.145f, 2.0f, 13.6173f, 2.0f, 11.9999f)
                curveTo(2.0f, 9.2715f, 3.0927f, 6.7983f, 4.8643f, 4.994f)
                lineTo(4.863f, 4.9997f)
                curveTo(4.3182f, 7.4342f, 4.2879f, 9.9424f, 4.7731f, 12.3864f)
                curveTo(4.8538f, 12.7927f, 5.2485f, 13.0567f, 5.6548f, 12.976f)
                curveTo(6.0611f, 12.8954f, 6.325f, 12.5006f, 6.2444f, 12.0943f)
                curveTo(5.6715f, 9.2089f, 5.8825f, 6.2246f, 6.8793f, 3.4087f)
                curveTo(7.9313f, 2.7803f, 9.1083f, 2.3397f, 10.3642f, 2.133f)
                lineTo(10.1849f, 2.5589f)
                curveTo(8.8661f, 5.691f, 9.0819f, 9.2395f, 10.7467f, 12.1824f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0812f, 11.4946f)
                curveTo(10.6179f, 8.9445f, 10.4221f, 5.8608f, 11.5673f, 3.141f)
                lineTo(12.0477f, 2.0f)
                curveTo(16.6319f, 2.0214f, 20.4872f, 5.1274f, 21.6449f, 9.3491f)
                curveTo(19.4613f, 7.516f, 16.8587f, 6.259f, 14.0806f, 5.677f)
                curveTo(13.6752f, 5.5921f, 13.2777f, 5.8519f, 13.1928f, 6.2573f)
                curveTo(13.1078f, 6.6627f, 13.3676f, 7.0602f, 13.773f, 7.1451f)
                curveTo(16.7254f, 7.7637f, 19.4587f, 9.2162f, 21.6241f, 11.3581f)
                lineTo(21.6261f, 11.3601f)
                lineTo(21.9965f, 11.7327f)
                curveTo(21.9988f, 11.8215f, 22.0f, 11.9106f, 22.0f, 11.9999f)
                curveTo(22.0f, 13.3876f, 21.7173f, 14.7093f, 21.2065f, 15.9105f)
                curveTo(18.9642f, 13.2084f, 15.6375f, 11.5871f, 12.0812f, 11.4946f)
                close()
            }
        }
            .build()
        return _volleyball2!!
    }

private var _volleyball2: ImageVector? = null
