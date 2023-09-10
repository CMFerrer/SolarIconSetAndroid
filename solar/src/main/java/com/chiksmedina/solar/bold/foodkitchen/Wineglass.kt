package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.Wineglass: ImageVector
    get() {
        if (_wineglass != null) {
            return _wineglass!!
        }
        _wineglass = Builder(
            name = "Wineglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 4.8947f)
                curveTo(5.0f, 3.8483f, 5.8483f, 3.0f, 6.8947f, 3.0f)
                horizontalLineTo(17.1053f)
                curveTo(18.1517f, 3.0f, 19.0f, 3.8483f, 19.0f, 4.8947f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 8.0837f, 18.9985f, 8.167f, 18.9956f, 8.25f)
                curveTo(18.9032f, 8.2505f, 18.8094f, 8.2681f, 18.7185f, 8.3048f)
                lineTo(18.7148f, 8.3063f)
                lineTo(18.6981f, 8.313f)
                curveTo(18.683f, 8.319f, 18.6598f, 8.3281f, 18.6295f, 8.3399f)
                curveTo(18.5688f, 8.3635f, 18.4792f, 8.3977f, 18.3666f, 8.4392f)
                curveTo(18.1409f, 8.5225f, 17.8245f, 8.6344f, 17.4626f, 8.7487f)
                curveTo(16.722f, 8.9828f, 15.8541f, 9.2063f, 15.1885f, 9.244f)
                curveTo(14.1043f, 9.3055f, 13.3288f, 8.8855f, 12.3672f, 8.3459f)
                lineTo(12.3243f, 8.3218f)
                curveTo(11.3911f, 7.7979f, 10.2738f, 7.1706f, 8.727f, 7.2583f)
                curveTo(7.8646f, 7.3072f, 6.8478f, 7.5801f, 6.0858f, 7.8208f)
                curveTo(5.6964f, 7.9439f, 5.357f, 8.0639f, 5.1147f, 8.1533f)
                curveTo(5.0747f, 8.1681f, 5.0373f, 8.182f, 5.0027f, 8.195f)
                curveTo(5.0009f, 8.1302f, 5.0f, 8.0652f, 5.0f, 8.0f)
                verticalLineTo(4.8947f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.2127f, 9.7192f)
                curveTo(5.9197f, 12.519f, 8.3136f, 14.6475f, 11.25f, 14.9603f)
                verticalLineTo(20.2499f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 20.2499f, 7.25f, 20.5857f, 7.25f, 20.9999f)
                curveTo(7.25f, 21.4141f, 7.5858f, 21.7499f, 8.0f, 21.7499f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 21.7499f, 16.75f, 21.4141f, 16.75f, 20.9999f)
                curveTo(16.75f, 20.5857f, 16.4142f, 20.2499f, 16.0f, 20.2499f)
                horizontalLineTo(12.75f)
                verticalLineTo(14.9603f)
                curveTo(15.6229f, 14.6543f, 17.9765f, 12.6103f, 18.7391f, 9.9f)
                curveTo(18.514f, 9.9812f, 18.2308f, 10.0791f, 17.9145f, 10.179f)
                curveTo(17.1526f, 10.4198f, 16.1358f, 10.6927f, 15.2734f, 10.7416f)
                curveTo(13.7266f, 10.8293f, 12.6093f, 10.202f, 11.6761f, 9.6781f)
                lineTo(11.6332f, 9.654f)
                curveTo(10.6716f, 9.1144f, 9.8961f, 8.6944f, 8.8119f, 8.7559f)
                curveTo(8.1463f, 8.7936f, 7.2784f, 9.0171f, 6.5378f, 9.2512f)
                curveTo(6.1759f, 9.3655f, 5.8595f, 9.4774f, 5.6338f, 9.5606f)
                curveTo(5.5212f, 9.6022f, 5.4316f, 9.6364f, 5.3709f, 9.66f)
                curveTo(5.3405f, 9.6718f, 5.3174f, 9.6809f, 5.3022f, 9.6869f)
                lineTo(5.2856f, 9.6936f)
                lineTo(5.2819f, 9.6951f)
                curveTo(5.259f, 9.7043f, 5.2359f, 9.7123f, 5.2127f, 9.7192f)
                close()
            }
        }
            .build()
        return _wineglass!!
    }

private var _wineglass: ImageVector? = null
