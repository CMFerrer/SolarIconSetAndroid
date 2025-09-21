package dev.chiksmedina.solar.bold.files

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
import dev.chiksmedina.solar.bold.FilesGroup

val FilesGroup.FileFavourite: ImageVector
    get() {
        if (_fileFavourite != null) {
            return _fileFavourite!!
        }
        _fileFavourite = Builder(
            name = "FileFavourite", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.3517f, 7.6167f)
                lineTo(15.3929f, 4.0538f)
                curveTo(14.2651f, 3.0387f, 13.7012f, 2.5311f, 13.0092f, 2.2656f)
                lineTo(13.0f, 5.0001f)
                curveTo(13.0f, 7.3571f, 13.0f, 8.5356f, 13.7322f, 9.2679f)
                curveTo(14.4645f, 10.0001f, 15.643f, 10.0001f, 18.0f, 10.0001f)
                horizontalLineTo(21.5801f)
                curveTo(21.2175f, 9.2959f, 20.5684f, 8.7116f, 19.3517f, 7.6167f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2387f, 2.0f, 10.0298f, 2.0f)
                curveTo(10.6358f, 2.0f, 11.1214f, 2.0f, 11.53f, 2.0167f)
                curveTo(11.5166f, 2.0966f, 11.5095f, 2.1781f, 11.5092f, 2.2606f)
                lineTo(11.5f, 5.095f)
                curveTo(11.4999f, 6.1921f, 11.4998f, 7.1616f, 11.6049f, 7.9432f)
                curveTo(11.7188f, 8.7903f, 11.9803f, 9.6373f, 12.6716f, 10.3285f)
                curveTo(13.3628f, 11.0198f, 14.2098f, 11.2813f, 15.0569f, 11.3952f)
                curveTo(15.8385f, 11.5003f, 16.808f, 11.5002f, 17.9051f, 11.5001f)
                lineTo(18.0f, 11.5001f)
                horizontalLineTo(21.9574f)
                curveTo(22.0f, 12.0344f, 22.0f, 12.6901f, 22.0f, 13.5629f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                close()
                moveTo(9.9524f, 13.1989f)
                lineTo(9.854f, 13.0225f)
                curveTo(9.4741f, 12.3408f, 9.2841f, 12.0f, 9.0f, 12.0f)
                curveTo(8.7159f, 12.0f, 8.5259f, 12.3408f, 8.146f, 13.0225f)
                lineTo(8.0476f, 13.1989f)
                curveTo(7.9397f, 13.3926f, 7.8857f, 13.4894f, 7.8015f, 13.5533f)
                curveTo(7.7173f, 13.6172f, 7.6125f, 13.641f, 7.4028f, 13.6884f)
                lineTo(7.2119f, 13.7316f)
                curveTo(6.474f, 13.8986f, 6.105f, 13.982f, 6.0172f, 14.2643f)
                curveTo(5.9295f, 14.5466f, 6.181f, 14.8407f, 6.684f, 15.429f)
                lineTo(6.8142f, 15.5812f)
                curveTo(6.9571f, 15.7483f, 7.0286f, 15.8319f, 7.0608f, 15.9353f)
                curveTo(7.0929f, 16.0387f, 7.0821f, 16.1502f, 7.0605f, 16.3733f)
                lineTo(7.0408f, 16.5763f)
                curveTo(6.9648f, 17.3612f, 6.9267f, 17.7536f, 7.1565f, 17.9281f)
                curveTo(7.3864f, 18.1025f, 7.7318f, 17.9435f, 8.4227f, 17.6253f)
                lineTo(8.6014f, 17.5431f)
                curveTo(8.7978f, 17.4527f, 8.8959f, 17.4075f, 9.0f, 17.4075f)
                curveTo(9.1041f, 17.4075f, 9.2022f, 17.4527f, 9.3986f, 17.5431f)
                lineTo(9.5773f, 17.6254f)
                curveTo(10.2682f, 17.9435f, 10.6136f, 18.1025f, 10.8435f, 17.9281f)
                curveTo(11.0733f, 17.7536f, 11.0352f, 17.3612f, 10.9592f, 16.5763f)
                lineTo(10.9395f, 16.3733f)
                curveTo(10.9179f, 16.1502f, 10.9071f, 16.0387f, 10.9392f, 15.9353f)
                curveTo(10.9714f, 15.8319f, 11.0429f, 15.7483f, 11.1858f, 15.5812f)
                lineTo(11.316f, 15.429f)
                curveTo(11.819f, 14.8407f, 12.0706f, 14.5466f, 11.9828f, 14.2643f)
                curveTo(11.895f, 13.982f, 11.526f, 13.8986f, 10.7881f, 13.7316f)
                lineTo(10.5972f, 13.6884f)
                curveTo(10.3875f, 13.641f, 10.2827f, 13.6172f, 10.1985f, 13.5533f)
                curveTo(10.1143f, 13.4894f, 10.0603f, 13.3926f, 9.9524f, 13.1989f)
                close()
            }
        }
            .build()
        return _fileFavourite!!
    }

private var _fileFavourite: ImageVector? = null
