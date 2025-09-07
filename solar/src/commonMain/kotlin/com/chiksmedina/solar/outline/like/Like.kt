package com.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.LikeGroup

val LikeGroup.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(
            name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4382f, 2.7784f)
                curveTo(12.2931f, 2.7318f, 12.1345f, 2.7431f, 11.9998f, 2.808f)
                curveTo(11.8523f, 2.8791f, 11.7548f, 3.0032f, 11.7197f, 3.1382f)
                lineTo(11.244f, 4.9721f)
                curveTo(11.0777f, 5.6134f, 10.8354f, 6.232f, 10.5235f, 6.816f)
                curveTo(10.0392f, 7.7227f, 9.3063f, 8.42f, 8.6265f, 9.0058f)
                lineTo(7.1877f, 10.2456f)
                curveTo(6.9647f, 10.4378f, 6.8474f, 10.7258f, 6.8728f, 11.0198f)
                lineTo(7.685f, 20.4125f)
                curveTo(7.726f, 20.887f, 8.1224f, 21.25f, 8.5963f, 21.25f)
                horizontalLineTo(13.245f)
                curveTo(16.3813f, 21.25f, 19.0238f, 19.0677f, 19.5306f, 16.1371f)
                lineTo(20.2361f, 12.0574f)
                curveTo(20.3332f, 11.4959f, 19.9014f, 10.9842f, 19.3348f, 10.9842f)
                horizontalLineTo(14.1537f)
                curveTo(13.1766f, 10.9842f, 12.4344f, 10.1076f, 12.5921f, 9.1447f)
                lineTo(13.2548f, 5.1002f)
                curveTo(13.3456f, 4.5461f, 13.3197f, 3.9792f, 13.1787f, 3.4358f)
                curveTo(13.1072f, 3.1601f, 12.8896f, 2.9234f, 12.5832f, 2.825f)
                lineTo(12.4382f, 2.7784f)
                lineTo(12.6676f, 2.0643f)
                lineTo(12.4382f, 2.7784f)
                close()
                moveTo(11.3486f, 1.4567f)
                curveTo(11.8312f, 1.2242f, 12.3873f, 1.1865f, 12.897f, 1.3503f)
                lineTo(13.042f, 1.3969f)
                lineTo(12.8126f, 2.1109f)
                lineTo(13.042f, 1.3969f)
                curveTo(13.819f, 1.6465f, 14.4252f, 2.2672f, 14.6307f, 3.0592f)
                curveTo(14.8241f, 3.8048f, 14.8596f, 4.5826f, 14.7351f, 5.3427f)
                lineTo(14.0724f, 9.3872f)
                curveTo(14.0639f, 9.439f, 14.1038f, 9.4842f, 14.1537f, 9.4842f)
                horizontalLineTo(19.3348f)
                curveTo(20.8341f, 9.4842f, 21.9695f, 10.8365f, 21.7142f, 12.313f)
                lineTo(21.0087f, 16.3928f)
                curveTo(20.3708f, 20.081f, 17.0712f, 22.75f, 13.245f, 22.75f)
                horizontalLineTo(8.5963f)
                curveTo(7.3427f, 22.75f, 6.2985f, 21.7902f, 6.1906f, 20.5417f)
                lineTo(5.3784f, 11.149f)
                curveTo(5.3115f, 10.3753f, 5.6202f, 9.6163f, 6.2085f, 9.1093f)
                lineTo(7.6473f, 7.8695f)
                curveTo(8.3025f, 7.3049f, 8.854f, 6.7577f, 9.2004f, 6.1092f)
                curveTo(9.457f, 5.6289f, 9.6557f, 5.1211f, 9.7921f, 4.5954f)
                lineTo(10.2678f, 2.7616f)
                curveTo(10.417f, 2.1863f, 10.8166f, 1.7131f, 11.3486f, 1.4567f)
                close()
                moveTo(2.9677f, 9.4849f)
                curveTo(3.3689f, 9.4676f, 3.7126f, 9.7694f, 3.7472f, 10.1696f)
                lineTo(4.7188f, 21.4061f)
                curveTo(4.7812f, 22.1279f, 4.2127f, 22.75f, 3.4867f, 22.75f)
                curveTo(2.8029f, 22.75f, 2.25f, 22.1953f, 2.25f, 21.5127f)
                verticalLineTo(10.2342f)
                curveTo(2.25f, 9.8326f, 2.5664f, 9.5022f, 2.9677f, 9.4849f)
                close()
            }
        }
            .build()
        return _like!!
    }

private var _like: ImageVector? = null
