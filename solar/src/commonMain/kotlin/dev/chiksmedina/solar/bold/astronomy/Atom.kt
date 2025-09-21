package dev.chiksmedina.solar.bold.astronomy

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
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(
            name = "Atom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0016f, 6.9979f)
                curveTo(15.8625f, 5.8588f, 14.6653f, 4.8686f, 13.4619f, 4.0462f)
                curveTo(14.8393f, 3.3451f, 16.1436f, 2.9237f, 17.2752f, 2.7931f)
                curveTo(18.7023f, 2.6285f, 19.7567f, 2.9317f, 20.4123f, 3.5873f)
                curveTo(21.0679f, 4.2429f, 21.3711f, 5.2974f, 21.2065f, 6.7244f)
                curveTo(21.0759f, 7.856f, 20.6545f, 9.1603f, 19.9534f, 10.5378f)
                curveTo(19.131f, 9.3343f, 18.1408f, 8.1371f, 17.0016f, 6.9979f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.941f, 8.0586f)
                curveTo(17.2144f, 9.332f, 18.2826f, 10.6744f, 19.1196f, 11.9995f)
                curveTo(18.2827f, 13.3245f, 17.2145f, 14.6668f, 15.9412f, 15.94f)
                curveTo(14.6677f, 17.2135f, 13.3253f, 18.2818f, 12.0002f, 19.1187f)
                curveTo(10.6751f, 18.2818f, 9.3328f, 17.2135f, 8.0594f, 15.9402f)
                curveTo(6.7861f, 14.6668f, 5.7179f, 13.3245f, 4.8809f, 11.9995f)
                curveTo(5.7179f, 10.6743f, 6.7862f, 9.3319f, 8.0596f, 8.0584f)
                curveTo(9.3329f, 6.7852f, 10.6752f, 5.7169f, 12.0002f, 4.8801f)
                curveTo(13.3253f, 5.717f, 14.6676f, 6.7852f, 15.941f, 8.0586f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(13.3807f, 14.5f, 14.5f, 13.3807f, 14.5f, 12.0f)
                curveTo(14.5f, 10.6193f, 13.3807f, 9.5f, 12.0f, 9.5f)
                curveTo(10.6193f, 9.5f, 9.5f, 10.6193f, 9.5f, 12.0f)
                curveTo(9.5f, 13.3807f, 10.6193f, 14.5f, 12.0f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4619f, 19.9526f)
                curveTo(14.6654f, 19.1301f, 15.8626f, 18.1399f, 17.0018f, 17.0007f)
                curveTo(18.1409f, 15.8616f, 19.131f, 14.6646f, 19.9534f, 13.4612f)
                curveTo(20.6544f, 14.8386f, 21.0758f, 16.1428f, 21.2063f, 17.2743f)
                curveTo(21.3709f, 18.7013f, 21.0677f, 19.7557f, 20.4121f, 20.4113f)
                curveTo(19.7565f, 21.0669f, 18.7021f, 21.3701f, 17.2751f, 21.2055f)
                curveTo(16.1435f, 21.075f, 14.8393f, 20.6536f, 13.4619f, 19.9526f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.9988f, 17.0008f)
                curveTo(8.1379f, 18.14f, 9.335f, 19.1301f, 10.5384f, 19.9525f)
                curveTo(9.1611f, 20.6535f, 7.8569f, 21.0749f, 6.7254f, 21.2054f)
                curveTo(5.2984f, 21.37f, 4.2441f, 21.0668f, 3.5885f, 20.4112f)
                curveTo(2.9329f, 19.7556f, 2.6297f, 18.7012f, 2.7943f, 17.2742f)
                curveTo(2.9248f, 16.1428f, 3.3462f, 14.8386f, 4.0471f, 13.4612f)
                curveTo(4.8695f, 14.6646f, 5.8597f, 15.8617f, 6.9988f, 17.0008f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0471f, 10.5377f)
                curveTo(4.8695f, 9.3342f, 5.8597f, 8.137f, 6.999f, 6.9978f)
                curveTo(8.138f, 5.8587f, 9.3351f, 4.8686f, 10.5385f, 4.0462f)
                curveTo(9.1611f, 3.3452f, 7.8568f, 2.9238f, 6.7253f, 2.7933f)
                curveTo(5.2983f, 2.6286f, 4.2439f, 2.9319f, 3.5883f, 3.5875f)
                curveTo(2.9327f, 4.2431f, 2.6295f, 5.2975f, 2.7941f, 6.7245f)
                curveTo(2.9246f, 7.8561f, 3.3461f, 9.1603f, 4.0471f, 10.5377f)
                close()
            }
        }
            .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
