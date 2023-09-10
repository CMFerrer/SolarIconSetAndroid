package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.StarRing: ImageVector
    get() {
        if (_starRing != null) {
            return _starRing!!
        }
        _starRing = Builder(
            name = "StarRing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.6734f, 15.6837f)
                curveTo(14.3463f, 16.75f, 14.6827f, 17.2832f, 14.4535f, 17.7193f)
                curveTo(14.2243f, 18.1555f, 13.5812f, 18.2057f, 12.2951f, 18.3061f)
                lineTo(11.9624f, 18.3321f)
                curveTo(11.5969f, 18.3606f, 11.4142f, 18.3749f, 11.2544f, 18.4588f)
                curveTo(11.0946f, 18.5428f, 10.976f, 18.6869f, 10.7386f, 18.9753f)
                lineTo(10.5225f, 19.2378f)
                curveTo(9.6871f, 20.2524f, 9.2695f, 20.7597f, 8.793f, 20.6944f)
                curveTo(8.3166f, 20.6292f, 8.0969f, 20.0346f, 7.6576f, 18.8455f)
                lineTo(7.544f, 18.5378f)
                curveTo(7.4191f, 18.1999f, 7.3567f, 18.031f, 7.234f, 17.9083f)
                curveTo(7.1114f, 17.7857f, 6.9425f, 17.7233f, 6.6045f, 17.5984f)
                lineTo(6.2969f, 17.4848f)
                curveTo(5.1078f, 17.0454f, 4.5132f, 16.8258f, 4.448f, 16.3493f)
                curveTo(4.3827f, 15.8729f, 4.89f, 15.4553f, 5.9046f, 14.6199f)
                lineTo(6.1671f, 14.4038f)
                curveTo(6.4554f, 14.1664f, 6.5996f, 14.0477f, 6.6836f, 13.888f)
                curveTo(6.7675f, 13.7282f, 6.7818f, 13.5455f, 6.8103f, 13.18f)
                lineTo(6.8363f, 12.8473f)
                curveTo(6.9367f, 11.5612f, 6.9869f, 10.9181f, 7.423f, 10.6889f)
                curveTo(7.8591f, 10.4597f, 8.3923f, 10.7961f, 9.4587f, 11.469f)
                lineTo(9.7346f, 11.643f)
                curveTo(10.0377f, 11.8343f, 10.1892f, 11.9299f, 10.3637f, 11.9538f)
                curveTo(10.5382f, 11.9777f, 10.716f, 11.9271f, 11.0715f, 11.8261f)
                lineTo(11.3952f, 11.7341f)
                curveTo(12.6464f, 11.3786f, 13.272f, 11.2008f, 13.6068f, 11.5356f)
                curveTo(13.9416f, 11.8704f, 13.7638f, 12.496f, 13.4083f, 13.7471f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.8291f, 19.9822f)
                curveTo(21.3391f, 21.0265f, 19.8604f, 21.2409f, 17.8486f, 20.7454f)
                moveTo(21.8291f, 19.9822f)
                curveTo(22.3624f, 18.8458f, 21.6185f, 16.9534f, 20.0f, 14.8529f)
                moveTo(21.8291f, 19.9822f)
                curveTo(21.1988f, 21.3256f, 18.9326f, 21.2956f, 16.0f, 20.1482f)
                moveTo(21.8291f, 19.9822f)
                curveTo(22.6984f, 18.1298f, 20.1742f, 14.2687f, 16.0f, 10.7717f)
                moveTo(2.1709f, 6.0176f)
                curveTo(1.6376f, 7.154f, 2.3815f, 9.0465f, 4.0f, 11.147f)
                moveTo(2.1709f, 6.0176f)
                curveTo(2.6609f, 4.9733f, 4.1396f, 4.759f, 6.1514f, 5.2545f)
                moveTo(2.1709f, 6.0176f)
                curveTo(1.4639f, 7.5242f, 3.0016f, 10.3594f, 5.8459f, 13.2469f)
                moveTo(2.1709f, 6.0176f)
                curveTo(3.0793f, 4.0817f, 7.3846f, 4.998f, 12.1861f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.8953f, 3.395f)
                curveTo(18.9939f, 4.3194f, 19.3815f, 5.1859f, 20.0f, 5.8646f)
                moveTo(18.8953f, 3.395f)
                curveTo(17.9645f, 4.1622f, 17.6651f, 4.3037f, 16.4925f, 4.5304f)
                moveTo(18.8953f, 3.395f)
                lineTo(19.2038f, 3.0f)
                moveTo(17.5972f, 7.0f)
                curveTo(17.4986f, 6.0757f, 17.111f, 5.2091f, 16.4925f, 4.5304f)
                moveTo(16.4925f, 4.5304f)
                lineTo(16.0f, 4.5138f)
            }
        }
            .build()
        return _starRing!!
    }

private var _starRing: ImageVector? = null
