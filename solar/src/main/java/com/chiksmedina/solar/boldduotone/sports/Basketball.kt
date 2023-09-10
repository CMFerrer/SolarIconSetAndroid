package com.chiksmedina.solar.boldduotone.sports

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
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(
            name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4528f, 8.3974f)
                curveTo(15.1814f, 6.9281f, 16.5399f, 5.1865f, 17.1249f, 3.4481f)
                lineTo(17.1354f, 3.417f)
                curveTo(18.5511f, 4.2624f, 19.7771f, 5.4703f, 20.6601f, 6.9997f)
                curveTo(21.5428f, 8.5287f, 21.9759f, 10.1939f, 22.0004f, 11.8422f)
                curveTo(20.0047f, 11.4109f, 17.8141f, 11.7412f, 15.7445f, 12.5213f)
                curveTo(15.4238f, 11.6576f, 15.0597f, 10.8344f, 14.6501f, 10.125f)
                curveTo(14.3139f, 9.5427f, 13.9038f, 8.9619f, 13.4528f, 8.3974f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.3396f, 16.9997f)
                curveTo(4.2227f, 18.5293f, 5.4489f, 19.7374f, 6.8649f, 20.5827f)
                lineTo(6.8654f, 20.5814f)
                curveTo(7.6835f, 18.1134f, 10.0653f, 15.6355f, 12.8571f, 13.9367f)
                curveTo(13.3432f, 13.6409f, 13.8476f, 13.3652f, 14.3649f, 13.1148f)
                curveTo(14.0628f, 12.2923f, 13.7247f, 11.5222f, 13.351f, 10.875f)
                curveTo(13.0529f, 10.3586f, 12.6829f, 9.8354f, 12.2697f, 9.3194f)
                curveTo(11.9238f, 9.5666f, 11.5682f, 9.8023f, 11.2055f, 10.025f)
                curveTo(8.4478f, 11.7181f, 5.0929f, 12.7682f, 2.1438f, 12.1874f)
                lineTo(1.9993f, 12.1589f)
                curveTo(2.024f, 13.8066f, 2.4571f, 15.4712f, 3.3396f, 16.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2258f, 13.9425f)
                curveTo(18.1134f, 13.2236f, 20.0374f, 12.9473f, 21.7027f, 13.3127f)
                lineTo(21.9074f, 13.3576f)
                curveTo(21.7856f, 14.2418f, 21.5463f, 15.1071f, 21.1961f, 15.9286f)
                curveTo(20.4717f, 17.6278f, 19.2729f, 19.1396f, 17.6585f, 20.2451f)
                lineTo(17.6461f, 20.166f)
                curveTo(17.6158f, 19.9748f, 17.5705f, 19.699f, 17.5099f, 19.3578f)
                curveTo(17.3887f, 18.6757f, 17.2059f, 17.7295f, 16.9592f, 16.672f)
                curveTo(16.7602f, 15.8192f, 16.5166f, 14.8803f, 16.2258f, 13.9425f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.3186f, 3.4541f)
                curveTo(8.0665f, 3.2547f, 7.8613f, 3.0975f, 7.7183f, 2.9894f)
                lineTo(7.696f, 2.9726f)
                curveTo(9.4584f, 2.13f, 11.3642f, 1.8489f, 13.1953f, 2.0709f)
                curveTo(14.0827f, 2.1784f, 14.9525f, 2.4041f, 15.7799f, 2.7413f)
                lineTo(15.703f, 2.9697f)
                curveTo(15.2258f, 4.3877f, 14.0529f, 5.9204f, 12.4746f, 7.2604f)
                curveTo(11.7442f, 6.4654f, 10.9739f, 5.7288f, 10.2721f, 5.0993f)
                curveTo(9.5149f, 4.4202f, 8.8223f, 3.8524f, 8.3186f, 3.4541f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.4204f, 8.7468f)
                curveTo(7.8338f, 10.3349f, 4.87f, 11.1956f, 2.4334f, 10.7157f)
                lineTo(2.0908f, 10.6483f)
                curveTo(2.4601f, 7.9549f, 3.9194f, 5.4374f, 6.2814f, 3.7952f)
                lineTo(6.6093f, 4.0336f)
                lineTo(6.6114f, 4.0351f)
                lineTo(6.6207f, 4.0419f)
                lineTo(6.6597f, 4.0707f)
                curveTo(6.6946f, 4.0965f, 6.7467f, 4.1354f, 6.8142f, 4.1863f)
                curveTo(6.9492f, 4.2883f, 7.1456f, 4.4388f, 7.3881f, 4.6306f)
                curveTo(7.8735f, 5.0144f, 8.5415f, 5.5621f, 9.2705f, 6.216f)
                curveTo(9.9303f, 6.8078f, 10.6282f, 7.4762f, 11.2825f, 8.1806f)
                curveTo(11.0033f, 8.3764f, 10.7155f, 8.5656f, 10.4204f, 8.7468f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2047f, 20.6626f)
                lineTo(16.2066f, 20.6755f)
                lineTo(16.2071f, 20.6791f)
                lineTo(16.2596f, 21.0475f)
                curveTo(13.6547f, 22.2776f, 10.7413f, 22.2853f, 8.2209f, 21.2588f)
                lineTo(8.2889f, 21.0535f)
                curveTo(8.9525f, 19.0517f, 11.0084f, 16.8174f, 13.6366f, 15.2182f)
                curveTo(14.0314f, 14.9779f, 14.4347f, 14.7547f, 14.8433f, 14.5507f)
                curveTo(15.0955f, 15.3805f, 15.314f, 16.2223f, 15.4984f, 17.0128f)
                curveTo(15.7377f, 18.0383f, 15.9153f, 18.9575f, 16.033f, 19.6201f)
                curveTo(16.0918f, 19.9512f, 16.1356f, 20.2176f, 16.1645f, 20.4004f)
                curveTo(16.179f, 20.4919f, 16.1898f, 20.5624f, 16.1968f, 20.6096f)
                lineTo(16.2047f, 20.6626f)
                close()
            }
        }
            .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
