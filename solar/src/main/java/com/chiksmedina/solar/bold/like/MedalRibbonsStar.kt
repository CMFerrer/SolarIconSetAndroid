package com.chiksmedina.solar.bold.like

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
import com.chiksmedina.solar.bold.LikeGroup

val LikeGroup.MedalRibbonsStar: ImageVector
    get() {
        if (_medalRibbonsStar != null) {
            return _medalRibbonsStar!!
        }
        _medalRibbonsStar = Builder(
            name = "MedalRibbonsStar", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 16.0f)
                curveTo(15.866f, 16.0f, 19.0f, 12.866f, 19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 5.134f, 5.0f, 9.0f)
                curveTo(5.0f, 12.866f, 8.134f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(11.7159f, 6.0f, 11.5259f, 6.3408f, 11.1459f, 7.0225f)
                lineTo(11.0476f, 7.1989f)
                curveTo(10.9397f, 7.3926f, 10.8857f, 7.4894f, 10.8015f, 7.5533f)
                curveTo(10.7173f, 7.6172f, 10.6125f, 7.641f, 10.4028f, 7.6884f)
                lineTo(10.2119f, 7.7316f)
                curveTo(9.474f, 7.8986f, 9.105f, 7.982f, 9.0172f, 8.2643f)
                curveTo(8.9295f, 8.5466f, 9.181f, 8.8407f, 9.684f, 9.429f)
                lineTo(9.8142f, 9.5812f)
                curveTo(9.9571f, 9.7483f, 10.0286f, 9.8319f, 10.0608f, 9.9353f)
                curveTo(10.0929f, 10.0387f, 10.0821f, 10.1502f, 10.0605f, 10.3733f)
                lineTo(10.0408f, 10.5763f)
                curveTo(9.9648f, 11.3612f, 9.9267f, 11.7536f, 10.1565f, 11.9281f)
                curveTo(10.3864f, 12.1025f, 10.7318f, 11.9435f, 11.4227f, 11.6254f)
                lineTo(11.6014f, 11.5431f)
                curveTo(11.7978f, 11.4527f, 11.8959f, 11.4075f, 12.0f, 11.4075f)
                curveTo(12.1041f, 11.4075f, 12.2022f, 11.4527f, 12.3986f, 11.5431f)
                lineTo(12.5773f, 11.6254f)
                curveTo(13.2682f, 11.9435f, 13.6136f, 12.1025f, 13.8435f, 11.9281f)
                curveTo(14.0733f, 11.7536f, 14.0352f, 11.3612f, 13.9592f, 10.5763f)
                lineTo(13.9395f, 10.3733f)
                curveTo(13.9179f, 10.1502f, 13.9071f, 10.0387f, 13.9392f, 9.9353f)
                curveTo(13.9714f, 9.8319f, 14.0429f, 9.7483f, 14.1858f, 9.5812f)
                lineTo(14.316f, 9.429f)
                curveTo(14.819f, 8.8407f, 15.0706f, 8.5466f, 14.9828f, 8.2643f)
                curveTo(14.895f, 7.982f, 14.526f, 7.8986f, 13.7881f, 7.7316f)
                lineTo(13.5972f, 7.6884f)
                curveTo(13.3875f, 7.641f, 13.2827f, 7.6172f, 13.1985f, 7.5533f)
                curveTo(13.1143f, 7.4894f, 13.0603f, 7.3926f, 12.9524f, 7.1989f)
                lineTo(12.8541f, 7.0225f)
                curveTo(12.4741f, 6.3408f, 12.2841f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4952f, 12.9941f)
                lineTo(2.9921f, 14.5505f)
                curveTo(2.4519f, 15.1097f, 2.1819f, 15.3893f, 2.0884f, 15.6261f)
                curveTo(1.8755f, 16.1657f, 2.0577f, 16.7643f, 2.5214f, 17.0482f)
                curveTo(2.7249f, 17.1727f, 3.0919f, 17.2115f, 3.8259f, 17.2892f)
                curveTo(4.2403f, 17.333f, 4.4475f, 17.3549f, 4.6211f, 17.4214f)
                curveTo(5.0097f, 17.5704f, 5.3119f, 17.8833f, 5.4557f, 18.2856f)
                curveTo(5.52f, 18.4653f, 5.5412f, 18.6799f, 5.5835f, 19.109f)
                curveTo(5.6585f, 19.869f, 5.696f, 20.249f, 5.8163f, 20.4597f)
                curveTo(6.0904f, 20.9398f, 6.6685f, 21.1285f, 7.1897f, 20.908f)
                curveTo(7.4184f, 20.8112f, 7.6884f, 20.5316f, 8.2285f, 19.9724f)
                lineTo(10.7106f, 17.4025f)
                curveTo(8.0131f, 16.9919f, 5.7323f, 15.3135f, 4.4952f, 12.9941f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.2894f, 17.4025f)
                lineTo(15.7715f, 19.9724f)
                curveTo(16.3116f, 20.5316f, 16.5816f, 20.8112f, 16.8103f, 20.908f)
                curveTo(17.3315f, 21.1285f, 17.9096f, 20.9398f, 18.1837f, 20.4597f)
                curveTo(18.304f, 20.249f, 18.3415f, 19.869f, 18.4165f, 19.109f)
                curveTo(18.4588f, 18.6799f, 18.48f, 18.4653f, 18.5442f, 18.2856f)
                curveTo(18.6881f, 17.8833f, 18.9903f, 17.5704f, 19.3789f, 17.4214f)
                curveTo(19.5525f, 17.3549f, 19.7597f, 17.333f, 20.1741f, 17.2892f)
                curveTo(20.9081f, 17.2115f, 21.2751f, 17.1727f, 21.4786f, 17.0482f)
                curveTo(21.9423f, 16.7643f, 22.1245f, 16.1657f, 21.9116f, 15.6261f)
                curveTo(21.8181f, 15.3893f, 21.5481f, 15.1097f, 21.0079f, 14.5505f)
                lineTo(19.5048f, 12.9941f)
                curveTo(18.2677f, 15.3135f, 15.9869f, 16.9919f, 13.2894f, 17.4025f)
                close()
            }
        }
            .build()
        return _medalRibbonsStar!!
    }

private var _medalRibbonsStar: ImageVector? = null
