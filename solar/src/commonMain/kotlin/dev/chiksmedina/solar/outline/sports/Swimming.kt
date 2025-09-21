package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Swimming: ImageVector
    get() {
        if (_swimming != null) {
            return _swimming!!
        }
        _swimming = Builder(
            name = "Swimming", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 3.75f)
                curveTo(16.0335f, 3.75f, 15.25f, 4.5335f, 15.25f, 5.5f)
                curveTo(15.25f, 6.4665f, 16.0335f, 7.25f, 17.0f, 7.25f)
                curveTo(17.9665f, 7.25f, 18.75f, 6.4665f, 18.75f, 5.5f)
                curveTo(18.75f, 4.5335f, 17.9665f, 3.75f, 17.0f, 3.75f)
                close()
                moveTo(13.75f, 5.5f)
                curveTo(13.75f, 3.7051f, 15.2051f, 2.25f, 17.0f, 2.25f)
                curveTo(18.7949f, 2.25f, 20.25f, 3.7051f, 20.25f, 5.5f)
                curveTo(20.25f, 7.2949f, 18.7949f, 8.75f, 17.0f, 8.75f)
                curveTo(15.2051f, 8.75f, 13.75f, 7.2949f, 13.75f, 5.5f)
                close()
                moveTo(8.4383f, 4.6304f)
                curveTo(8.1823f, 4.3402f, 7.7344f, 4.3262f, 7.4608f, 4.5999f)
                curveTo(7.2129f, 4.8478f, 7.1976f, 5.2448f, 7.4258f, 5.511f)
                lineTo(8.4135f, 6.6633f)
                curveTo(9.3202f, 7.7211f, 9.0574f, 9.3402f, 7.8628f, 10.057f)
                lineTo(4.3859f, 12.1431f)
                curveTo(4.0307f, 12.3562f, 3.57f, 12.2411f, 3.3569f, 11.8859f)
                curveTo(3.1438f, 11.5307f, 3.2589f, 11.07f, 3.6141f, 10.8569f)
                lineTo(7.091f, 8.7707f)
                curveTo(7.4893f, 8.5318f, 7.5768f, 7.9921f, 7.2746f, 7.6395f)
                lineTo(6.2869f, 6.4872f)
                curveTo(5.5486f, 5.6259f, 5.598f, 4.3414f, 6.4001f, 3.5392f)
                curveTo(7.2856f, 2.6537f, 8.7346f, 2.699f, 9.5631f, 3.638f)
                lineTo(16.0624f, 11.0038f)
                curveTo(16.3364f, 11.3144f, 16.3068f, 11.7883f, 15.9962f, 12.0624f)
                curveTo(15.6856f, 12.3364f, 15.2117f, 12.3068f, 14.9376f, 11.9962f)
                lineTo(8.4383f, 4.6304f)
                close()
                moveTo(4.5698f, 12.8657f)
                curveTo(5.2567f, 11.7919f, 6.7273f, 11.8271f, 7.4575f, 12.7618f)
                curveTo(8.4475f, 14.0291f, 9.8295f, 15.25f, 12.0f, 15.25f)
                curveTo(14.2086f, 15.25f, 15.5697f, 14.2712f, 16.505f, 13.0209f)
                curveTo(17.2249f, 12.0585f, 18.7907f, 11.9013f, 19.5456f, 13.0435f)
                curveTo(20.1706f, 13.9891f, 20.8486f, 14.7306f, 22.172f, 15.0424f)
                curveTo(22.5752f, 15.1374f, 22.825f, 15.5412f, 22.73f, 15.9444f)
                curveTo(22.635f, 16.3476f, 22.2311f, 16.5974f, 21.828f, 16.5024f)
                curveTo(19.976f, 16.066f, 19.0204f, 14.9692f, 18.2942f, 13.8705f)
                curveTo(18.2373f, 13.7844f, 18.1517f, 13.7406f, 18.0407f, 13.7427f)
                curveTo(17.9221f, 13.7449f, 17.7934f, 13.8027f, 17.7061f, 13.9195f)
                curveTo(16.5384f, 15.4804f, 14.7602f, 16.75f, 12.0f, 16.75f)
                curveTo(9.1574f, 16.75f, 7.3886f, 15.1101f, 6.2755f, 13.6853f)
                curveTo(6.2037f, 13.5934f, 6.1101f, 13.5585f, 6.0296f, 13.5602f)
                curveTo(5.9537f, 13.5619f, 5.8842f, 13.5946f, 5.8335f, 13.674f)
                curveTo(5.094f, 14.8301f, 4.1391f, 16.0389f, 2.172f, 16.5024f)
                curveTo(1.7688f, 16.5974f, 1.365f, 16.3476f, 1.27f, 15.9444f)
                curveTo(1.175f, 15.5412f, 1.4248f, 15.1374f, 1.828f, 15.0424f)
                curveTo(3.2289f, 14.7123f, 3.9076f, 13.9011f, 4.5698f, 12.8657f)
                close()
                moveTo(4.5698f, 17.8657f)
                curveTo(5.2567f, 16.7919f, 6.7273f, 16.8271f, 7.4575f, 17.7618f)
                curveTo(8.4475f, 19.0291f, 9.8295f, 20.25f, 12.0f, 20.25f)
                curveTo(14.2086f, 20.25f, 15.5697f, 19.2712f, 16.505f, 18.0209f)
                curveTo(17.2249f, 17.0585f, 18.7907f, 16.9013f, 19.5456f, 18.0435f)
                curveTo(20.1706f, 18.9891f, 20.8486f, 19.7306f, 22.172f, 20.0424f)
                curveTo(22.5752f, 20.1374f, 22.825f, 20.5412f, 22.73f, 20.9444f)
                curveTo(22.635f, 21.3476f, 22.2311f, 21.5974f, 21.828f, 21.5024f)
                curveTo(19.976f, 21.066f, 19.0204f, 19.9692f, 18.2942f, 18.8705f)
                curveTo(18.2373f, 18.7844f, 18.1517f, 18.7406f, 18.0407f, 18.7427f)
                curveTo(17.9221f, 18.7449f, 17.7934f, 18.8027f, 17.7061f, 18.9195f)
                curveTo(16.5384f, 20.4804f, 14.7602f, 21.75f, 12.0f, 21.75f)
                curveTo(9.1574f, 21.75f, 7.3886f, 20.1101f, 6.2755f, 18.6853f)
                curveTo(6.2037f, 18.5934f, 6.1101f, 18.5585f, 6.0296f, 18.5602f)
                curveTo(5.9537f, 18.5619f, 5.8842f, 18.5946f, 5.8335f, 18.674f)
                curveTo(5.094f, 19.8301f, 4.1391f, 21.0389f, 2.172f, 21.5024f)
                curveTo(1.7688f, 21.5974f, 1.365f, 21.3476f, 1.27f, 20.9444f)
                curveTo(1.175f, 20.5412f, 1.4248f, 20.1374f, 1.828f, 20.0424f)
                curveTo(3.2289f, 19.7123f, 3.9076f, 18.9011f, 4.5698f, 17.8657f)
                close()
            }
        }
            .build()
        return _swimming!!
    }

private var _swimming: ImageVector? = null
