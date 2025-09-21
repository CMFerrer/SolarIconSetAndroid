package dev.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.KeyMinimalisticSquare: ImageVector
    get() {
        if (_keyMinimalisticSquare != null) {
            return _keyMinimalisticSquare!!
        }
        _keyMinimalisticSquare = Builder(
            name = "KeyMinimalisticSquare", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(9.6094f, 6.8183f)
                curveTo(11.7004f, 4.7272f, 15.0907f, 4.7272f, 17.1817f, 6.8183f)
                curveTo(19.2728f, 8.9093f, 19.2728f, 12.2996f, 17.1817f, 14.3906f)
                curveTo(15.793f, 15.7793f, 13.8316f, 16.2448f, 12.0608f, 15.7906f)
                lineTo(9.61f, 18.2413f)
                curveTo(9.237f, 18.6144f, 8.7146f, 18.7976f, 8.1902f, 18.7394f)
                lineTo(6.7979f, 18.5847f)
                curveTo(6.4802f, 18.5494f, 6.1839f, 18.407f, 5.9579f, 18.1809f)
                lineTo(5.8191f, 18.0421f)
                curveTo(5.593f, 17.8161f, 5.4506f, 17.5199f, 5.4153f, 17.2022f)
                lineTo(5.2606f, 15.8098f)
                curveTo(5.2024f, 15.2854f, 5.3856f, 14.763f, 5.7587f, 14.39f)
                lineTo(8.2094f, 11.9392f)
                curveTo(7.7552f, 10.1684f, 8.2207f, 8.207f, 9.6094f, 6.8183f)
                close()
                moveTo(16.1211f, 7.8789f)
                curveTo(14.6158f, 6.3737f, 12.1753f, 6.3737f, 10.6701f, 7.8789f)
                curveTo(9.6712f, 8.8778f, 9.3343f, 10.2888f, 9.6626f, 11.5675f)
                curveTo(9.7821f, 12.0328f, 9.6869f, 12.583f, 9.2941f, 12.9759f)
                lineTo(6.8193f, 15.4506f)
                curveTo(6.7685f, 15.5015f, 6.7435f, 15.5727f, 6.7515f, 15.6441f)
                lineTo(6.9026f, 17.0043f)
                lineTo(6.9956f, 17.0974f)
                lineTo(8.3559f, 17.2485f)
                curveTo(8.4274f, 17.2565f, 8.4985f, 17.2315f, 8.5494f, 17.1807f)
                lineTo(8.8431f, 16.887f)
                lineTo(8.2132f, 16.264f)
                curveTo(7.9187f, 15.9728f, 7.9161f, 15.4979f, 8.2074f, 15.2034f)
                curveTo(8.4986f, 14.9089f, 8.9735f, 14.9063f, 9.268f, 15.1976f)
                lineTo(9.9037f, 15.8263f)
                lineTo(11.0243f, 14.7058f)
                curveTo(11.4174f, 14.3127f, 11.9675f, 14.218f, 12.4325f, 14.3374f)
                curveTo(13.7112f, 14.6657f, 15.1222f, 14.3288f, 16.1211f, 13.3299f)
                curveTo(17.6263f, 11.8247f, 17.6263f, 9.3842f, 16.1211f, 7.8789f)
                close()
                moveTo(11.8602f, 9.1935f)
                curveTo(12.6738f, 8.3799f, 13.9929f, 8.3799f, 14.8065f, 9.1935f)
                curveTo(15.6201f, 10.0071f, 15.6201f, 11.3262f, 14.8065f, 12.1398f)
                curveTo(13.9929f, 12.9534f, 12.6738f, 12.9534f, 11.8602f, 12.1398f)
                curveTo(11.0466f, 11.3262f, 11.0466f, 10.0071f, 11.8602f, 9.1935f)
                close()
                moveTo(13.7458f, 10.2542f)
                curveTo(13.518f, 10.0264f, 13.1487f, 10.0264f, 12.9209f, 10.2542f)
                curveTo(12.693f, 10.482f, 12.693f, 10.8513f, 12.9209f, 11.0791f)
                curveTo(13.1487f, 11.307f, 13.518f, 11.307f, 13.7458f, 11.0791f)
                curveTo(13.9736f, 10.8513f, 13.9736f, 10.482f, 13.7458f, 10.2542f)
                close()
            }
        }
            .build()
        return _keyMinimalisticSquare!!
    }

private var _keyMinimalisticSquare: ImageVector? = null
