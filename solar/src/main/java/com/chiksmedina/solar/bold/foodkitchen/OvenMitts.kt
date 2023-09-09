package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.FoodKitchenGroup

public val FoodKitchenGroup.OvenMitts: ImageVector
    get() {
        if (_ovenMitts != null) {
            return _ovenMitts!!
        }
        _ovenMitts = Builder(name = "OvenMitts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0188f, 16.5368f)
                lineTo(7.5876f, 20.0262f)
                curveTo(8.9334f, 21.3421f, 9.6064f, 22.0f, 10.4426f, 22.0f)
                curveTo(10.9565f, 22.0f, 11.4087f, 21.7515f, 11.9933f, 21.2546f)
                curveTo(12.3511f, 20.9505f, 12.53f, 20.7984f, 12.5379f, 20.5781f)
                curveTo(12.5458f, 20.3578f, 12.3693f, 20.1846f, 12.0164f, 19.8381f)
                lineTo(4.1065f, 12.0731f)
                curveTo(3.8662f, 11.8372f, 3.746f, 11.7192f, 3.6137f, 11.6863f)
                curveTo(3.5239f, 11.664f, 3.4364f, 11.6662f, 3.3478f, 11.6931f)
                curveTo(3.2173f, 11.7327f, 3.1013f, 11.8589f, 2.8692f, 12.1112f)
                curveTo(2.2897f, 12.7412f, 2.0f, 13.2089f, 2.0f, 13.7454f)
                curveTo(2.0f, 14.563f, 2.6729f, 15.221f, 4.0188f, 16.5368f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0783f, 13.3965f)
                curveTo(22.6406f, 10.8913f, 22.6406f, 6.8295f, 20.0783f, 4.3243f)
                curveTo(17.516f, 1.8191f, 13.3618f, 1.8191f, 10.7995f, 4.3243f)
                lineTo(10.3341f, 4.7793f)
                curveTo(9.9148f, 3.1516f, 8.6676f, 1.9784f, 7.213f, 2.0003f)
                curveTo(5.4409f, 2.0269f, 4.0322f, 3.8173f, 4.0665f, 5.9992f)
                lineTo(4.0332f, 9.4565f)
                curveTo(4.031f, 9.6748f, 4.0299f, 9.784f, 4.0689f, 9.8782f)
                curveTo(4.1078f, 9.9725f, 4.1843f, 10.0475f, 4.3372f, 10.1976f)
                lineTo(13.1253f, 18.8247f)
                curveTo(13.4555f, 19.1488f, 13.6205f, 19.3109f, 13.8247f, 19.3111f)
                curveTo(14.0288f, 19.3113f, 14.1942f, 19.1496f, 14.525f, 18.8261f)
                lineTo(20.0783f, 13.3965f)
                close()
            }
        }
        .build()
        return _ovenMitts!!
    }

private var _ovenMitts: ImageVector? = null
