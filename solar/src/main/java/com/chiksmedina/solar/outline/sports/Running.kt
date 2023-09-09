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

public val SportsGroup.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 2.75f)
                curveTo(17.5335f, 2.75f, 16.75f, 3.5335f, 16.75f, 4.5f)
                curveTo(16.75f, 5.4665f, 17.5335f, 6.25f, 18.5f, 6.25f)
                curveTo(19.4665f, 6.25f, 20.25f, 5.4665f, 20.25f, 4.5f)
                curveTo(20.25f, 3.5335f, 19.4665f, 2.75f, 18.5f, 2.75f)
                close()
                moveTo(15.25f, 4.5f)
                curveTo(15.25f, 2.7051f, 16.7051f, 1.25f, 18.5f, 1.25f)
                curveTo(20.2949f, 1.25f, 21.75f, 2.7051f, 21.75f, 4.5f)
                curveTo(21.75f, 6.2949f, 20.2949f, 7.75f, 18.5f, 7.75f)
                curveTo(16.7051f, 7.75f, 15.25f, 6.2949f, 15.25f, 4.5f)
                close()
                moveTo(10.0522f, 5.9306f)
                curveTo(10.2617f, 5.9017f, 10.5099f, 5.8754f, 10.773f, 5.887f)
                curveTo(10.853f, 5.8906f, 10.9438f, 5.8971f, 11.0462f, 5.9077f)
                curveTo(13.4289f, 6.155f, 15.1968f, 7.9432f, 16.3742f, 9.7093f)
                lineTo(16.4366f, 9.8028f)
                curveTo(17.0393f, 10.7069f, 18.0541f, 11.25f, 19.1407f, 11.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 11.25f, 21.75f, 11.5858f, 21.75f, 12.0f)
                curveTo(21.75f, 12.4142f, 21.4142f, 12.75f, 21.0f, 12.75f)
                horizontalLineTo(19.1407f)
                curveTo(17.5525f, 12.75f, 16.0695f, 11.9563f, 15.1885f, 10.6349f)
                lineTo(15.1262f, 10.5414f)
                curveTo(14.8537f, 10.1327f, 14.561f, 9.7447f, 14.2489f, 9.3894f)
                lineTo(12.3649f, 11.7441f)
                curveTo(11.9375f, 12.2783f, 11.6508f, 12.6379f, 11.4576f, 12.9334f)
                curveTo(11.2704f, 13.2196f, 11.217f, 13.3792f, 11.2028f, 13.5003f)
                curveTo(11.1793f, 13.7003f, 11.2046f, 13.903f, 11.2763f, 14.0911f)
                curveTo(11.3198f, 14.2051f, 11.4107f, 14.3467f, 11.6623f, 14.5783f)
                curveTo(11.9221f, 14.8173f, 12.2882f, 15.0957f, 12.8335f, 15.5088f)
                curveTo(12.8657f, 15.5332f, 12.8975f, 15.5573f, 12.9289f, 15.5811f)
                curveTo(13.6498f, 16.1267f, 14.1489f, 16.5046f, 14.4944f, 17.0094f)
                curveTo(14.6908f, 17.2964f, 14.8463f, 17.6093f, 14.9565f, 17.9392f)
                curveTo(15.1502f, 18.5194f, 15.15f, 19.1454f, 15.1496f, 20.0495f)
                curveTo(15.1496f, 20.0888f, 15.1496f, 20.1287f, 15.1496f, 20.1692f)
                verticalLineTo(21.9998f)
                curveTo(15.1496f, 22.414f, 14.8138f, 22.7498f, 14.3996f, 22.7498f)
                curveTo(13.9854f, 22.7498f, 13.6496f, 22.414f, 13.6496f, 21.9998f)
                verticalLineTo(20.1692f)
                curveTo(13.6496f, 19.0986f, 13.6405f, 18.7342f, 13.5337f, 18.4143f)
                curveTo(13.4676f, 18.2164f, 13.3743f, 18.0287f, 13.2565f, 17.8565f)
                curveTo(13.0661f, 17.5782f, 12.781f, 17.3509f, 11.9277f, 16.7045f)
                lineTo(11.8989f, 16.6826f)
                curveTo(11.3898f, 16.297f, 10.9655f, 15.9755f, 10.6465f, 15.682f)
                curveTo(10.3135f, 15.3754f, 10.0355f, 15.0471f, 9.8748f, 14.6256f)
                curveTo(9.7169f, 14.2116f, 9.6614f, 13.7657f, 9.713f, 13.3257f)
                curveTo(9.7655f, 12.8776f, 9.9545f, 12.4912f, 10.2022f, 12.1124f)
                curveTo(10.4395f, 11.7496f, 10.7721f, 11.3339f, 11.1711f, 10.8352f)
                lineTo(13.1547f, 8.356f)
                curveTo(12.4675f, 7.8332f, 11.7108f, 7.4847f, 10.8914f, 7.3997f)
                curveTo(10.8172f, 7.392f, 10.7559f, 7.3877f, 10.7065f, 7.3856f)
                curveTo(10.5786f, 7.3799f, 10.4355f, 7.3919f, 10.2574f, 7.4165f)
                curveTo(9.192f, 7.5636f, 8.1245f, 8.1555f, 5.8062f, 9.4727f)
                lineTo(4.3705f, 10.2884f)
                curveTo(4.0104f, 10.4931f, 3.5525f, 10.367f, 3.3479f, 10.0069f)
                curveTo(3.1433f, 9.6467f, 3.2694f, 9.1889f, 3.6295f, 8.9843f)
                lineTo(5.0652f, 8.1685f)
                curveTo(5.1164f, 8.1394f, 5.1672f, 8.1106f, 5.2175f, 8.082f)
                curveTo(7.3365f, 6.8776f, 8.666f, 6.122f, 10.0522f, 5.9306f)
                close()
                moveTo(9.4801f, 16.4238f)
                curveTo(9.7984f, 16.689f, 9.8413f, 17.1619f, 9.5762f, 17.4801f)
                lineTo(8.5754f, 18.6811f)
                curveTo(8.5428f, 18.7202f, 8.5107f, 18.7588f, 8.4789f, 18.7969f)
                curveTo(7.8369f, 19.5685f, 7.3655f, 20.135f, 6.7076f, 20.4432f)
                curveTo(6.0496f, 20.7513f, 5.3127f, 20.7508f, 4.3089f, 20.7501f)
                curveTo(4.2593f, 20.75f, 4.209f, 20.75f, 4.1581f, 20.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 20.75f, 2.25f, 20.4142f, 2.25f, 20.0f)
                curveTo(2.25f, 19.5858f, 2.5858f, 19.25f, 3.0f, 19.25f)
                horizontalLineTo(4.1581f)
                curveTo(5.3797f, 19.25f, 5.754f, 19.2334f, 6.0713f, 19.0848f)
                curveTo(6.3887f, 18.9361f, 6.641f, 18.6593f, 7.4231f, 17.7208f)
                lineTo(8.4238f, 16.5199f)
                curveTo(8.689f, 16.2017f, 9.1619f, 16.1587f, 9.4801f, 16.4238f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
