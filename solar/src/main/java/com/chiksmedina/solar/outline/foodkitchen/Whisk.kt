package com.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoodKitchenGroup

public val FoodKitchenGroup.Whisk: ImageVector
    get() {
        if (_whisk != null) {
            return _whisk!!
        }
        _whisk = Builder(name = "Whisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.9519f, 2.8737f)
                curveTo(16.1403f, 2.4673f, 13.9348f, 3.0734f, 12.294f, 4.7142f)
                curveTo(11.1265f, 5.8816f, 10.2154f, 7.6245f, 9.8638f, 9.3282f)
                curveTo(9.7289f, 9.9817f, 9.681f, 10.5996f, 9.7197f, 11.1614f)
                curveTo(9.9048f, 10.8075f, 10.1194f, 10.4492f, 10.3481f, 10.0976f)
                curveTo(11.3191f, 8.6049f, 12.6635f, 7.0552f, 13.5766f, 6.1421f)
                curveTo(14.491f, 5.2277f, 15.8483f, 4.0762f, 17.1557f, 3.3f)
                curveTo(17.417f, 3.1449f, 17.6842f, 3.0f, 17.9519f, 2.8737f)
                close()
                moveTo(21.0787f, 2.921f)
                curveTo(18.4781f, 0.3204f, 13.9916f, 0.8953f, 11.2333f, 3.6535f)
                curveTo(9.8433f, 5.0435f, 8.8011f, 7.0564f, 8.3947f, 9.025f)
                curveTo(8.2804f, 9.5785f, 8.2137f, 10.1455f, 8.2084f, 10.705f)
                lineTo(2.3035f, 16.6097f)
                curveTo(0.8988f, 18.0143f, 0.8988f, 20.2917f, 2.3035f, 21.6963f)
                curveTo(3.7082f, 23.101f, 5.9856f, 23.101f, 7.3903f, 21.6963f)
                lineTo(13.2958f, 15.791f)
                curveTo(13.8549f, 15.7856f, 14.4215f, 15.7188f, 14.9746f, 15.6047f)
                curveTo(16.9433f, 15.1983f, 18.9562f, 14.1561f, 20.3462f, 12.7662f)
                curveTo(23.1045f, 10.0079f, 23.6794f, 5.5216f, 21.0787f, 2.921f)
                close()
                moveTo(20.0181f, 3.9817f)
                curveTo(19.9728f, 3.9364f, 19.8405f, 3.847f, 19.4318f, 3.9307f)
                curveTo(19.0285f, 4.0134f, 18.5105f, 4.2402f, 17.9215f, 4.5898f)
                curveTo(16.7529f, 5.2836f, 15.4935f, 6.3466f, 14.6373f, 7.2028f)
                curveTo(13.7798f, 8.0601f, 12.507f, 9.5296f, 11.6055f, 10.9155f)
                curveTo(11.1513f, 11.6137f, 10.8205f, 12.2468f, 10.6683f, 12.745f)
                curveTo(10.5925f, 12.9933f, 10.5739f, 13.1676f, 10.5821f, 13.2779f)
                curveTo(10.5859f, 13.3297f, 10.595f, 13.3583f, 10.6003f, 13.3712f)
                curveTo(10.6048f, 13.3822f, 10.6082f, 13.3858f, 10.6109f, 13.3885f)
                curveTo(10.6136f, 13.3913f, 10.6173f, 13.3946f, 10.6283f, 13.3991f)
                curveTo(10.6412f, 13.4045f, 10.6698f, 13.4136f, 10.7216f, 13.4174f)
                curveTo(10.832f, 13.4256f, 11.0064f, 13.407f, 11.2547f, 13.3312f)
                curveTo(11.753f, 13.179f, 12.3862f, 12.8483f, 13.0844f, 12.3942f)
                curveTo(14.4705f, 11.4928f, 15.9401f, 10.2202f, 16.7975f, 9.3628f)
                curveTo(17.6536f, 8.5067f, 18.7165f, 7.2473f, 19.4102f, 6.0786f)
                curveTo(19.7598f, 5.4895f, 19.9865f, 4.9714f, 20.0691f, 4.5681f)
                curveTo(20.1528f, 4.1593f, 20.0634f, 4.027f, 20.0181f, 3.9817f)
                close()
                moveTo(12.8386f, 14.2798f)
                curveTo(13.1925f, 14.0947f, 13.5507f, 13.8803f, 13.9022f, 13.6517f)
                curveTo(15.395f, 12.6809f, 16.945f, 11.3366f, 17.8581f, 10.4235f)
                curveTo(18.7725f, 9.5091f, 19.924f, 8.1517f, 20.7001f, 6.8442f)
                curveTo(20.8551f, 6.5829f, 20.9999f, 6.3159f, 21.1262f, 6.0482f)
                curveTo(21.5325f, 7.8596f, 20.9262f, 10.0648f, 19.2855f, 11.7055f)
                curveTo(18.1181f, 12.8729f, 16.3751f, 13.7839f, 14.6714f, 14.1356f)
                curveTo(14.0181f, 14.2705f, 13.4004f, 14.3183f, 12.8386f, 14.2798f)
                close()
                moveTo(11.422f, 15.5435f)
                curveTo(10.7226f, 15.3333f, 10.0812f, 14.9801f, 9.5503f, 14.4492f)
                curveTo(9.0195f, 13.9185f, 8.6665f, 13.2775f, 8.4562f, 12.5785f)
                lineTo(3.3642f, 17.6704f)
                curveTo(2.5453f, 18.4892f, 2.5453f, 19.8168f, 3.3642f, 20.6357f)
                curveTo(4.183f, 21.4545f, 5.5107f, 21.4545f, 6.3296f, 20.6357f)
                lineTo(11.422f, 15.5435f)
                close()
            }
        }
        .build()
        return _whisk!!
    }

private var _whisk: ImageVector? = null
