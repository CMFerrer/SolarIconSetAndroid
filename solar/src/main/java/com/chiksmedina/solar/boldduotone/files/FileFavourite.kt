package com.chiksmedina.solar.boldduotone.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.FilesGroup

public val FilesGroup.FileFavourite: ImageVector
    get() {
        if (_fileFavourite != null) {
            return _fileFavourite!!
        }
        _fileFavourite = Builder(name = "FileFavourite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.854f, 14.0225f)
                lineTo(8.9524f, 14.1989f)
                curveTo(9.0603f, 14.3926f, 9.1143f, 14.4894f, 9.1985f, 14.5533f)
                curveTo(9.2827f, 14.6172f, 9.3875f, 14.641f, 9.5972f, 14.6884f)
                lineTo(9.7881f, 14.7316f)
                curveTo(10.526f, 14.8986f, 10.895f, 14.982f, 10.9828f, 15.2643f)
                curveTo(11.0706f, 15.5466f, 10.819f, 15.8407f, 10.316f, 16.429f)
                lineTo(10.1858f, 16.5812f)
                curveTo(10.0429f, 16.7483f, 9.9714f, 16.8319f, 9.9392f, 16.9353f)
                curveTo(9.9071f, 17.0387f, 9.9179f, 17.1502f, 9.9395f, 17.3733f)
                lineTo(9.9592f, 17.5763f)
                curveTo(10.0352f, 18.3612f, 10.0733f, 18.7536f, 9.8435f, 18.9281f)
                curveTo(9.6137f, 19.1025f, 9.2682f, 18.9435f, 8.5773f, 18.6254f)
                lineTo(8.3986f, 18.5431f)
                curveTo(8.2022f, 18.4527f, 8.1041f, 18.4075f, 8.0f, 18.4075f)
                curveTo(7.8959f, 18.4075f, 7.7978f, 18.4527f, 7.6014f, 18.5431f)
                lineTo(7.4227f, 18.6253f)
                curveTo(6.7318f, 18.9435f, 6.3864f, 19.1025f, 6.1565f, 18.9281f)
                curveTo(5.9267f, 18.7536f, 5.9648f, 18.3612f, 6.0408f, 17.5763f)
                lineTo(6.0605f, 17.3733f)
                curveTo(6.0821f, 17.1502f, 6.0929f, 17.0387f, 6.0608f, 16.9353f)
                curveTo(6.0286f, 16.8319f, 5.9571f, 16.7483f, 5.8142f, 16.5812f)
                lineTo(5.684f, 16.429f)
                curveTo(5.181f, 15.8407f, 4.9295f, 15.5466f, 5.0172f, 15.2643f)
                curveTo(5.105f, 14.982f, 5.474f, 14.8986f, 6.2119f, 14.7316f)
                lineTo(6.4028f, 14.6884f)
                curveTo(6.6125f, 14.641f, 6.7173f, 14.6172f, 6.8015f, 14.5533f)
                curveTo(6.8857f, 14.4894f, 6.9397f, 14.3926f, 7.0476f, 14.1989f)
                lineTo(7.1459f, 14.0225f)
                curveTo(7.5259f, 13.3408f, 7.7159f, 13.0f, 8.0f, 13.0f)
                curveTo(8.2841f, 13.0f, 8.4741f, 13.3408f, 8.854f, 14.0225f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5092f, 2.2601f)
                lineTo(11.5f, 5.0945f)
                curveTo(11.4999f, 6.1916f, 11.4998f, 7.1612f, 11.6049f, 7.9427f)
                curveTo(11.7188f, 8.7898f, 11.9803f, 9.6368f, 12.6716f, 10.3281f)
                curveTo(13.3629f, 11.0193f, 14.2098f, 11.2808f, 15.057f, 11.3947f)
                curveTo(15.8385f, 11.4998f, 16.808f, 11.4997f, 17.9051f, 11.4996f)
                lineTo(21.9574f, 11.4996f)
                curveTo(21.9698f, 11.6552f, 21.9786f, 11.821f, 21.9848f, 11.9995f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 11.732f, 22.0f, 11.5983f, 21.9901f, 11.4408f)
                curveTo(21.9335f, 10.5463f, 21.5617f, 9.5212f, 21.0315f, 8.7985f)
                curveTo(20.9382f, 8.6713f, 20.8743f, 8.5949f, 20.7467f, 8.4422f)
                curveTo(19.9542f, 7.4936f, 18.911f, 6.3119f, 18.0f, 5.4995f)
                curveTo(17.1892f, 4.7765f, 16.0787f, 3.9854f, 15.1101f, 3.3385f)
                curveTo(14.2781f, 2.7827f, 13.862f, 2.5049f, 13.2915f, 2.2983f)
                curveTo(13.1403f, 2.2436f, 12.9408f, 2.1831f, 12.7846f, 2.1447f)
                curveTo(12.4006f, 2.0501f, 12.0268f, 2.0173f, 11.5f, 2.0059f)
                lineTo(11.5092f, 2.2601f)
                close()
            }
        }
        .build()
        return _fileFavourite!!
    }

private var _fileFavourite: ImageVector? = null
