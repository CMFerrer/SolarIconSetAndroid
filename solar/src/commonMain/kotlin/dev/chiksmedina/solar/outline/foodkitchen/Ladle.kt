package dev.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.Ladle: ImageVector
    get() {
        if (_ladle != null) {
            return _ladle!!
        }
        _ladle = Builder(
            name = "Ladle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.4342f, 2.5f)
                curveTo(3.8137f, 2.5f, 2.5f, 3.8137f, 2.5f, 5.4342f)
                curveTo(2.5f, 5.8484f, 2.1642f, 6.1842f, 1.75f, 6.1842f)
                curveTo(1.3358f, 6.1842f, 1.0f, 5.8484f, 1.0f, 5.4342f)
                curveTo(1.0f, 2.9853f, 2.9853f, 1.0f, 5.4342f, 1.0f)
                curveTo(7.8832f, 1.0f, 9.8684f, 2.9853f, 9.8684f, 5.4342f)
                verticalLineTo(12.3464f)
                curveTo(10.2351f, 12.128f, 10.6549f, 11.9388f, 11.0983f, 11.7774f)
                curveTo(12.4312f, 11.2924f, 14.1438f, 11.0f, 15.75f, 11.0f)
                curveTo(17.3577f, 11.0f, 18.9554f, 11.293f, 20.1765f, 11.787f)
                curveTo(20.7849f, 12.0331f, 21.3375f, 12.3443f, 21.7508f, 12.7259f)
                curveTo(22.1622f, 13.1058f, 22.5f, 13.6198f, 22.5f, 14.25f)
                verticalLineTo(15.4342f)
                curveTo(22.5f, 19.3365f, 19.3365f, 22.5f, 15.4342f, 22.5f)
                curveTo(11.5319f, 22.5f, 8.3684f, 19.3365f, 8.3684f, 15.4342f)
                verticalLineTo(5.4342f)
                curveTo(8.3684f, 3.8137f, 7.0547f, 2.5f, 5.4342f, 2.5f)
                close()
                moveTo(20.9235f, 16.3592f)
                curveTo(20.483f, 18.9928f, 18.193f, 21.0f, 15.4342f, 21.0f)
                curveTo(12.6142f, 21.0f, 10.2841f, 18.9028f, 9.9184f, 16.1829f)
                curveTo(10.273f, 16.389f, 10.6748f, 16.5685f, 11.0983f, 16.7226f)
                curveTo(12.4312f, 17.2076f, 14.1438f, 17.5f, 15.75f, 17.5f)
                curveTo(17.3577f, 17.5f, 18.9554f, 17.2071f, 20.1765f, 16.713f)
                curveTo(20.438f, 16.6072f, 20.6892f, 16.4894f, 20.9235f, 16.3592f)
                close()
                moveTo(21.0f, 14.25f)
                curveTo(21.0f, 14.1898f, 20.9695f, 14.0462f, 20.7332f, 13.8279f)
                curveTo(20.4986f, 13.6113f, 20.1238f, 13.3838f, 19.6139f, 13.1775f)
                curveTo(18.5985f, 12.7667f, 17.1962f, 12.5f, 15.75f, 12.5f)
                curveTo(14.3023f, 12.5f, 12.7649f, 12.7672f, 11.6112f, 13.187f)
                curveTo(11.0315f, 13.398f, 10.5894f, 13.6329f, 10.3071f, 13.8606f)
                curveTo(10.0115f, 14.099f, 10.0f, 14.2357f, 10.0f, 14.25f)
                curveTo(10.0f, 14.2643f, 10.0115f, 14.401f, 10.3071f, 14.6394f)
                curveTo(10.5894f, 14.8671f, 11.0315f, 15.102f, 11.6113f, 15.313f)
                curveTo(12.7649f, 15.7328f, 14.3023f, 16.0f, 15.75f, 16.0f)
                curveTo(17.1962f, 16.0f, 18.5985f, 15.7334f, 19.6139f, 15.3225f)
                curveTo(20.1238f, 15.1163f, 20.4986f, 14.8887f, 20.7332f, 14.6721f)
                curveTo(20.9695f, 14.4538f, 21.0f, 14.3102f, 21.0f, 14.25f)
                close()
            }
        }
            .build()
        return _ladle!!
    }

private var _ladle: ImageVector? = null
