package dev.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.OvenMittsMinimalistic: ImageVector
    get() {
        if (_ovenMittsMinimalistic != null) {
            return _ovenMittsMinimalistic!!
        }
        _ovenMittsMinimalistic = Builder(
            name = "OvenMittsMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5876f, 20.0262f)
                lineTo(4.0188f, 16.5368f)
                curveTo(2.6729f, 15.221f, 2.0f, 14.563f, 2.0f, 13.7454f)
                curveTo(2.0f, 13.2089f, 2.2897f, 12.7412f, 2.8692f, 12.1112f)
                curveTo(3.4604f, 11.4685f, 3.7559f, 11.1471f, 3.8897f, 10.8109f)
                curveTo(4.0234f, 10.4748f, 4.0271f, 10.0967f, 4.0343f, 9.3406f)
                lineTo(4.0665f, 5.9992f)
                curveTo(4.0322f, 3.8173f, 5.4409f, 2.0269f, 7.213f, 2.0003f)
                curveTo(8.6676f, 1.9784f, 9.9148f, 3.1516f, 10.3341f, 4.7793f)
                lineTo(10.7995f, 4.3243f)
                curveTo(13.3618f, 1.8191f, 17.516f, 1.8191f, 20.0783f, 4.3243f)
                curveTo(22.6406f, 6.8295f, 22.6406f, 10.8913f, 20.0783f, 13.3965f)
                lineTo(13.2976f, 20.0262f)
                curveTo(11.9518f, 21.3421f, 11.2788f, 22.0f, 10.4426f, 22.0f)
                curveTo(9.6064f, 22.0f, 8.9334f, 21.3421f, 7.5876f, 20.0262f)
                close()
                moveTo(5.9803f, 12.8722f)
                curveTo(6.2699f, 12.576f, 6.7448f, 12.5706f, 7.0409f, 12.8602f)
                lineTo(11.3235f, 17.0474f)
                curveTo(11.6196f, 17.337f, 11.625f, 17.8118f, 11.3354f, 18.108f)
                curveTo(11.0458f, 18.4041f, 10.571f, 18.4095f, 10.2748f, 18.1199f)
                lineTo(5.9923f, 13.9328f)
                curveTo(5.6961f, 13.6432f, 5.6908f, 13.1683f, 5.9803f, 12.8722f)
                close()
            }
        }
            .build()
        return _ovenMittsMinimalistic!!
    }

private var _ovenMittsMinimalistic: ImageVector? = null
