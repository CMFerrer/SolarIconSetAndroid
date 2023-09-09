package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.3666f, 3.492f)
                curveTo(8.8659f, 3.8881f, 9.5388f, 4.4415f, 10.2722f, 5.0993f)
                curveTo(10.9741f, 5.7288f, 11.7444f, 6.4654f, 12.4748f, 7.2604f)
                curveTo(13.8781f, 6.0689f, 14.9611f, 4.725f, 15.5193f, 3.4449f)
                curveTo(14.7472f, 3.1279f, 13.9346f, 2.916f, 13.1053f, 2.8154f)
                curveTo(11.5313f, 2.6246f, 9.8983f, 2.8355f, 8.3666f, 3.492f)
                close()
                moveTo(16.8582f, 4.1261f)
                curveTo(16.1801f, 5.635f, 14.9565f, 7.1193f, 13.4527f, 8.3974f)
                curveTo(13.9037f, 8.9619f, 14.3138f, 9.5427f, 14.65f, 10.125f)
                curveTo(15.0596f, 10.8345f, 15.4237f, 11.6577f, 15.7444f, 12.5213f)
                curveTo(17.5567f, 11.8382f, 19.4617f, 11.5f, 21.2473f, 11.7161f)
                curveTo(21.2033f, 10.2364f, 20.8024f, 8.7464f, 20.0105f, 7.3747f)
                curveTo(19.2162f, 5.9991f, 18.1222f, 4.9045f, 16.8582f, 4.1261f)
                close()
                moveTo(21.1696f, 13.2185f)
                curveTo(19.6336f, 13.0103f, 17.9152f, 13.2991f, 16.226f, 13.9425f)
                curveTo(16.5168f, 14.8803f, 16.7604f, 15.8192f, 16.9594f, 16.6719f)
                curveTo(17.2061f, 17.7294f, 17.3889f, 18.6757f, 17.5101f, 19.3577f)
                curveTo(17.5139f, 19.3794f, 17.5177f, 19.4008f, 17.5214f, 19.422f)
                curveTo(18.8707f, 18.421f, 19.8799f, 17.1037f, 20.5063f, 15.6344f)
                curveTo(20.8353f, 14.8626f, 21.0586f, 14.0494f, 21.1696f, 13.2185f)
                close()
                moveTo(16.1438f, 20.2698f)
                curveTo(16.1161f, 20.0989f, 16.0792f, 19.8793f, 16.0332f, 19.6201f)
                curveTo(15.9155f, 18.9575f, 15.7379f, 18.0383f, 15.4986f, 17.0128f)
                curveTo(15.3141f, 16.2223f, 15.0957f, 15.3805f, 14.8435f, 14.5507f)
                curveTo(14.4349f, 14.7547f, 14.0316f, 14.9779f, 13.6367f, 15.2182f)
                curveTo(11.2249f, 16.6857f, 9.2951f, 18.6881f, 8.4809f, 20.5547f)
                curveTo(10.8834f, 21.541f, 13.6752f, 21.5096f, 16.1438f, 20.2698f)
                close()
                moveTo(7.142f, 19.8736f)
                curveTo(8.1428f, 17.6465f, 10.3323f, 15.473f, 12.857f, 13.9368f)
                curveTo(13.3431f, 13.641f, 13.8475f, 13.3652f, 14.3648f, 13.1149f)
                curveTo(14.0627f, 12.2923f, 13.7246f, 11.5223f, 13.3509f, 10.875f)
                curveTo(13.0528f, 10.3587f, 12.6828f, 9.8354f, 12.2696f, 9.3194f)
                curveTo(11.9237f, 9.5666f, 11.5681f, 9.8024f, 11.2054f, 10.0251f)
                curveTo(8.6358f, 11.6027f, 5.5475f, 12.6221f, 2.7523f, 12.2838f)
                curveTo(2.7964f, 13.7632f, 3.1971f, 15.2532f, 3.989f, 16.6247f)
                curveTo(4.7834f, 18.0006f, 5.8778f, 19.0952f, 7.142f, 19.8736f)
                close()
                moveTo(2.8298f, 10.7814f)
                curveTo(3.1749f, 8.1987f, 4.6031f, 5.7877f, 6.9217f, 4.2679f)
                curveTo(7.0461f, 4.3628f, 7.2039f, 4.4847f, 7.3883f, 4.6306f)
                curveTo(7.8737f, 5.0144f, 8.5416f, 5.562f, 9.2707f, 6.216f)
                curveTo(9.9305f, 6.8078f, 10.6284f, 7.4761f, 11.2827f, 8.1806f)
                curveTo(11.0034f, 8.3764f, 10.7157f, 8.5656f, 10.4206f, 8.7468f)
                curveTo(7.9726f, 10.2497f, 5.1869f, 11.1012f, 2.8298f, 10.7814f)
                close()
                moveTo(6.6247f, 2.6899f)
                curveTo(8.7198f, 1.4803f, 11.0549f, 1.0559f, 13.2858f, 1.3263f)
                curveTo(16.5255f, 1.719f, 19.5507f, 3.5785f, 21.3095f, 6.6247f)
                curveTo(23.0682f, 9.6709f, 23.166f, 13.2206f, 21.8862f, 16.2227f)
                curveTo(21.0049f, 18.2898f, 19.4698f, 20.0999f, 17.3747f, 21.3095f)
                curveTo(12.2331f, 24.278f, 5.6585f, 22.5164f, 2.6899f, 17.3747f)
                curveTo(-0.2786f, 12.2331f, 1.4831f, 5.6585f, 6.6247f, 2.6899f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
