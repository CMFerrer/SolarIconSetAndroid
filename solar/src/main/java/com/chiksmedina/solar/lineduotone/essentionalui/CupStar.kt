package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.CupStar: ImageVector
    get() {
        if (_cupStar != null) {
            return _cupStar!!
        }
        _cupStar = Builder(name = "CupStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0002f, 16.0f)
                curveTo(6.2402f, 16.0f, 5.2198f, 10.2595f, 5.0391f, 5.7065f)
                curveTo(4.9888f, 4.44f, 4.9637f, 3.8067f, 5.4394f, 3.2208f)
                curveTo(5.9151f, 2.6349f, 6.4844f, 2.5389f, 7.6232f, 2.3467f)
                curveTo(8.7472f, 2.1571f, 10.2166f, 2.0f, 12.0002f, 2.0f)
                curveTo(13.7837f, 2.0f, 15.2531f, 2.1571f, 16.3771f, 2.3467f)
                curveTo(17.5159f, 2.5389f, 18.0852f, 2.6349f, 18.5609f, 3.2208f)
                curveTo(19.0367f, 3.8067f, 19.0115f, 4.44f, 18.9612f, 5.7065f)
                curveTo(18.7805f, 10.2595f, 17.7601f, 16.0f, 12.0002f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 22.0f)
                horizontalLineTo(8.5f)
                lineTo(8.8392f, 20.3039f)
                curveTo(8.9327f, 19.8365f, 9.3431f, 19.5f, 9.8198f, 19.5f)
                horizontalLineTo(14.1802f)
                curveTo(14.6569f, 19.5f, 15.0673f, 19.8365f, 15.1608f, 20.3039f)
                lineTo(15.5f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                lineTo(19.9486f, 5.3162f)
                curveTo(20.9387f, 5.6462f, 21.4337f, 5.8112f, 21.7168f, 6.2041f)
                curveTo(22.0f, 6.5969f, 22.0f, 7.1187f, 21.9999f, 8.1623f)
                lineTo(21.9999f, 8.2349f)
                curveTo(21.9999f, 9.0956f, 21.9999f, 9.526f, 21.7927f, 9.8781f)
                curveTo(21.5855f, 10.2302f, 21.2093f, 10.4392f, 20.4569f, 10.8572f)
                lineTo(17.5f, 12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9999f, 5.0f)
                lineTo(4.0513f, 5.3162f)
                curveTo(3.0613f, 5.6462f, 2.5662f, 5.8112f, 2.2831f, 6.2041f)
                curveTo(2.0f, 6.5969f, 2.0f, 7.1187f, 2.0f, 8.1623f)
                lineTo(2.0f, 8.2349f)
                curveTo(2.0f, 9.0956f, 2.0f, 9.526f, 2.2072f, 9.8781f)
                curveTo(2.4144f, 10.2302f, 2.7906f, 10.4392f, 3.5431f, 10.8572f)
                lineTo(6.4999f, 12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.1459f, 6.0225f)
                curveTo(11.5259f, 5.3408f, 11.7159f, 5.0f, 12.0f, 5.0f)
                curveTo(12.2841f, 5.0f, 12.4741f, 5.3408f, 12.8541f, 6.0225f)
                lineTo(12.9524f, 6.1989f)
                curveTo(13.0603f, 6.3926f, 13.1143f, 6.4894f, 13.1985f, 6.5533f)
                curveTo(13.2827f, 6.6172f, 13.3875f, 6.641f, 13.5972f, 6.6884f)
                lineTo(13.7881f, 6.7316f)
                curveTo(14.526f, 6.8986f, 14.895f, 6.982f, 14.9828f, 7.2643f)
                curveTo(15.0706f, 7.5466f, 14.819f, 7.8407f, 14.316f, 8.429f)
                lineTo(14.1858f, 8.5812f)
                curveTo(14.0429f, 8.7483f, 13.9714f, 8.8319f, 13.9392f, 8.9353f)
                curveTo(13.9071f, 9.0387f, 13.9179f, 9.1502f, 13.9395f, 9.3733f)
                lineTo(13.9592f, 9.5763f)
                curveTo(14.0352f, 10.3612f, 14.0733f, 10.7536f, 13.8435f, 10.9281f)
                curveTo(13.6136f, 11.1025f, 13.2682f, 10.9435f, 12.5773f, 10.6254f)
                lineTo(12.3986f, 10.5431f)
                curveTo(12.2022f, 10.4527f, 12.1041f, 10.4075f, 12.0f, 10.4075f)
                curveTo(11.8959f, 10.4075f, 11.7978f, 10.4527f, 11.6014f, 10.5431f)
                lineTo(11.4227f, 10.6254f)
                curveTo(10.7318f, 10.9435f, 10.3864f, 11.1025f, 10.1565f, 10.9281f)
                curveTo(9.9267f, 10.7536f, 9.9648f, 10.3612f, 10.0408f, 9.5763f)
                lineTo(10.0605f, 9.3733f)
                curveTo(10.0821f, 9.1502f, 10.0929f, 9.0387f, 10.0608f, 8.9353f)
                curveTo(10.0286f, 8.8319f, 9.9571f, 8.7483f, 9.8142f, 8.5812f)
                lineTo(9.684f, 8.429f)
                curveTo(9.181f, 7.8407f, 8.9295f, 7.5466f, 9.0172f, 7.2643f)
                curveTo(9.105f, 6.982f, 9.474f, 6.8986f, 10.2119f, 6.7316f)
                lineTo(10.4028f, 6.6884f)
                curveTo(10.6125f, 6.641f, 10.7173f, 6.6172f, 10.8015f, 6.5533f)
                curveTo(10.8857f, 6.4894f, 10.9397f, 6.3926f, 11.0476f, 6.1989f)
                lineTo(11.1459f, 6.0225f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
            }
        }
        .build()
        return _cupStar!!
    }

private var _cupStar: ImageVector? = null
