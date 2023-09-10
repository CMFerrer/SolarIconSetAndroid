package com.chiksmedina.solar.linear.sports

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
import com.chiksmedina.solar.linear.SportsGroup

val SportsGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(
            name = "Ranking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 22.0f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 11.5858f, 16.0f, 10.8787f, 15.5607f, 10.4393f)
                curveTo(15.1213f, 10.0f, 14.4142f, 10.0f, 13.0f, 10.0f)
                horizontalLineTo(11.0f)
                curveTo(9.5858f, 10.0f, 8.8787f, 10.0f, 8.4393f, 10.4393f)
                curveTo(8.0f, 10.8787f, 8.0f, 11.5858f, 8.0f, 13.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 22.0f)
                curveTo(8.0f, 20.5858f, 8.0f, 19.8787f, 7.5607f, 19.4393f)
                curveTo(7.1213f, 19.0f, 6.4142f, 19.0f, 5.0f, 19.0f)
                curveTo(3.5858f, 19.0f, 2.8787f, 19.0f, 2.4393f, 19.4393f)
                curveTo(2.0f, 19.8787f, 2.0f, 20.5858f, 2.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 22.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 17.5858f, 22.0f, 16.8787f, 21.5607f, 16.4393f)
                curveTo(21.1213f, 16.0f, 20.4142f, 16.0f, 19.0f, 16.0f)
                curveTo(17.5858f, 16.0f, 16.8787f, 16.0f, 16.4393f, 16.4393f)
                curveTo(16.0f, 16.8787f, 16.0f, 17.5858f, 16.0f, 19.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.1459f, 3.0225f)
                curveTo(11.5259f, 2.3408f, 11.7159f, 2.0f, 12.0f, 2.0f)
                curveTo(12.2841f, 2.0f, 12.4741f, 2.3408f, 12.8541f, 3.0225f)
                lineTo(12.9524f, 3.1989f)
                curveTo(13.0603f, 3.3926f, 13.1143f, 3.4894f, 13.1985f, 3.5533f)
                curveTo(13.2827f, 3.6172f, 13.3875f, 3.641f, 13.5972f, 3.6884f)
                lineTo(13.7881f, 3.7316f)
                curveTo(14.526f, 3.8986f, 14.895f, 3.982f, 14.9828f, 4.2643f)
                curveTo(15.0706f, 4.5466f, 14.819f, 4.8407f, 14.316f, 5.429f)
                lineTo(14.1858f, 5.5812f)
                curveTo(14.0429f, 5.7483f, 13.9714f, 5.8319f, 13.9392f, 5.9353f)
                curveTo(13.9071f, 6.0387f, 13.9179f, 6.1502f, 13.9395f, 6.3733f)
                lineTo(13.9592f, 6.5763f)
                curveTo(14.0352f, 7.3612f, 14.0733f, 7.7536f, 13.8435f, 7.9281f)
                curveTo(13.6136f, 8.1025f, 13.2682f, 7.9435f, 12.5773f, 7.6253f)
                lineTo(12.3986f, 7.543f)
                curveTo(12.2022f, 7.4527f, 12.1041f, 7.4075f, 12.0f, 7.4075f)
                curveTo(11.8959f, 7.4075f, 11.7978f, 7.4527f, 11.6014f, 7.543f)
                lineTo(11.4227f, 7.6253f)
                curveTo(10.7318f, 7.9435f, 10.3864f, 8.1025f, 10.1565f, 7.9281f)
                curveTo(9.9267f, 7.7536f, 9.9648f, 7.3612f, 10.0408f, 6.5763f)
                lineTo(10.0605f, 6.3733f)
                curveTo(10.0821f, 6.1502f, 10.0929f, 6.0387f, 10.0608f, 5.9353f)
                curveTo(10.0286f, 5.8319f, 9.9571f, 5.7483f, 9.8142f, 5.5812f)
                lineTo(9.684f, 5.429f)
                curveTo(9.181f, 4.8407f, 8.9295f, 4.5466f, 9.0172f, 4.2643f)
                curveTo(9.105f, 3.982f, 9.474f, 3.8986f, 10.2119f, 3.7316f)
                lineTo(10.4028f, 3.6884f)
                curveTo(10.6125f, 3.641f, 10.7173f, 3.6172f, 10.8015f, 3.5533f)
                curveTo(10.8857f, 3.4894f, 10.9397f, 3.3926f, 11.0476f, 3.1989f)
                lineTo(11.1459f, 3.0225f)
                close()
            }
        }
            .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null
