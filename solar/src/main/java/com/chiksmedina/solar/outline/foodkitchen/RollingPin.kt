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

public val FoodKitchenGroup.RollingPin: ImageVector
    get() {
        if (_rollingPin != null) {
            return _rollingPin!!
        }
        _rollingPin = Builder(name = "RollingPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.3093f, 2.3579f)
                curveTo(18.3614f, 1.0336f, 20.3128f, 0.8721f, 21.5683f, 2.0054f)
                curveTo(21.6243f, 2.0559f, 21.686f, 2.1177f, 21.7692f, 2.2008f)
                lineTo(21.7993f, 2.2309f)
                curveTo(21.8823f, 2.3139f, 21.9442f, 2.3758f, 21.9947f, 2.4317f)
                curveTo(23.1279f, 3.6872f, 22.9664f, 5.6386f, 21.6422f, 6.6907f)
                curveTo(21.5831f, 6.7377f, 21.512f, 6.7884f, 21.4162f, 6.8568f)
                lineTo(19.3067f, 8.3637f)
                curveTo(19.6901f, 8.8857f, 19.9437f, 9.4296f, 19.9437f, 10.0721f)
                curveTo(19.9437f, 10.7538f, 19.6591f, 11.3197f, 19.2447f, 11.8629f)
                curveTo(18.8504f, 12.3796f, 18.2754f, 12.9545f, 17.5801f, 13.6498f)
                lineTo(13.6498f, 17.5801f)
                curveTo(12.9545f, 18.2755f, 12.3795f, 18.8505f, 11.8629f, 19.2447f)
                curveTo(11.3197f, 19.6591f, 10.7538f, 19.9437f, 10.0721f, 19.9437f)
                curveTo(9.4296f, 19.9437f, 8.8857f, 19.6901f, 8.3637f, 19.3067f)
                lineTo(6.8568f, 21.4162f)
                curveTo(6.7884f, 21.512f, 6.7377f, 21.5831f, 6.6907f, 21.6422f)
                curveTo(5.6386f, 22.9664f, 3.6872f, 23.1279f, 2.4317f, 21.9947f)
                curveTo(2.3758f, 21.9442f, 2.314f, 21.8823f, 2.2309f, 21.7993f)
                lineTo(2.2008f, 21.7692f)
                curveTo(2.1177f, 21.686f, 2.0559f, 21.6243f, 2.0054f, 21.5683f)
                curveTo(0.8721f, 20.3128f, 1.0336f, 18.3614f, 2.3579f, 17.3093f)
                curveTo(2.4169f, 17.2624f, 2.4881f, 17.2115f, 2.5838f, 17.1432f)
                lineTo(4.6934f, 15.6364f)
                curveTo(4.31f, 15.1143f, 4.0564f, 14.5705f, 4.0564f, 13.9279f)
                curveTo(4.0564f, 13.2463f, 4.341f, 12.6803f, 4.7554f, 12.1371f)
                curveTo(5.1496f, 11.6205f, 5.7246f, 11.0455f, 6.4199f, 10.3502f)
                lineTo(10.3502f, 6.4199f)
                curveTo(11.0455f, 5.7246f, 11.6205f, 5.1496f, 12.1372f, 4.7554f)
                curveTo(12.6803f, 4.341f, 13.2463f, 4.0564f, 13.9279f, 4.0564f)
                curveTo(14.5705f, 4.0564f, 15.1143f, 4.31f, 15.6364f, 4.6934f)
                lineTo(17.1432f, 2.5838f)
                curveTo(17.2115f, 2.4881f, 17.2624f, 2.4169f, 17.3093f, 2.3579f)
                close()
                moveTo(16.7684f, 5.6893f)
                curveTo(17.0048f, 5.9191f, 17.2583f, 6.1727f, 17.532f, 6.4463f)
                lineTo(17.5537f, 6.4681f)
                curveTo(17.8274f, 6.7417f, 18.0809f, 6.9952f, 18.3107f, 7.2317f)
                lineTo(20.5272f, 5.6485f)
                curveTo(20.6478f, 5.5624f, 20.6843f, 5.536f, 20.7091f, 5.5163f)
                curveTo(21.3556f, 5.0026f, 21.4345f, 4.0498f, 20.8812f, 3.4368f)
                curveTo(20.86f, 3.4133f, 20.8282f, 3.3812f, 20.7235f, 3.2765f)
                curveTo(20.6188f, 3.1717f, 20.5867f, 3.14f, 20.5632f, 3.1188f)
                curveTo(19.9502f, 2.5655f, 18.9975f, 2.6444f, 18.4838f, 3.291f)
                curveTo(18.4641f, 3.3157f, 18.4376f, 3.3524f, 18.3516f, 3.4728f)
                lineTo(16.7684f, 5.6893f)
                close()
                moveTo(5.6893f, 16.7684f)
                lineTo(3.4728f, 18.3516f)
                curveTo(3.3524f, 18.4376f, 3.3157f, 18.4641f, 3.291f, 18.4838f)
                curveTo(2.6444f, 18.9975f, 2.5655f, 19.9502f, 3.1188f, 20.5632f)
                curveTo(3.14f, 20.5867f, 3.1717f, 20.6188f, 3.2765f, 20.7235f)
                curveTo(3.3812f, 20.8282f, 3.4133f, 20.86f, 3.4368f, 20.8812f)
                curveTo(4.0498f, 21.4345f, 5.0026f, 21.3556f, 5.5163f, 20.7091f)
                curveTo(5.536f, 20.6843f, 5.5624f, 20.6478f, 5.6485f, 20.5272f)
                lineTo(7.2317f, 18.3107f)
                curveTo(6.9952f, 18.0809f, 6.7417f, 17.8274f, 6.4681f, 17.5537f)
                lineTo(6.4463f, 17.532f)
                curveTo(6.1727f, 17.2583f, 5.9191f, 17.0048f, 5.6893f, 16.7684f)
                close()
                moveTo(13.047f, 5.9479f)
                curveTo(12.62f, 6.2737f, 12.1157f, 6.7758f, 11.3736f, 7.5178f)
                lineTo(7.5178f, 11.3736f)
                curveTo(6.7758f, 12.1157f, 6.2737f, 12.62f, 5.9479f, 13.047f)
                curveTo(5.6353f, 13.4568f, 5.5564f, 13.7061f, 5.5564f, 13.9279f)
                curveTo(5.5564f, 14.2286f, 5.7006f, 14.569f, 6.3407f, 15.2737f)
                curveTo(6.6474f, 15.6115f, 7.0337f, 15.9981f, 7.5178f, 16.4822f)
                curveTo(8.002f, 16.9663f, 8.3885f, 17.3526f, 8.7263f, 17.6594f)
                curveTo(9.431f, 18.2995f, 9.7714f, 18.4437f, 10.0721f, 18.4437f)
                curveTo(10.2939f, 18.4437f, 10.5433f, 18.3647f, 10.953f, 18.0521f)
                curveTo(11.3801f, 17.7263f, 11.8844f, 17.2242f, 12.6264f, 16.4822f)
                lineTo(16.4822f, 12.6264f)
                curveTo(17.2242f, 11.8844f, 17.7263f, 11.3801f, 18.0521f, 10.953f)
                curveTo(18.3647f, 10.5433f, 18.4437f, 10.2939f, 18.4437f, 10.0721f)
                curveTo(18.4437f, 9.7714f, 18.2995f, 9.431f, 17.6594f, 8.7263f)
                curveTo(17.3526f, 8.3885f, 16.9663f, 8.002f, 16.4822f, 7.5178f)
                curveTo(15.9981f, 7.0337f, 15.6115f, 6.6474f, 15.2737f, 6.3407f)
                curveTo(14.569f, 5.7006f, 14.2286f, 5.5564f, 13.9279f, 5.5564f)
                curveTo(13.7061f, 5.5564f, 13.4568f, 5.6353f, 13.047f, 5.9479f)
                close()
            }
        }
        .build()
        return _rollingPin!!
    }

private var _rollingPin: ImageVector? = null
