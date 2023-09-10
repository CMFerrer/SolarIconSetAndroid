package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

val TimeGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(
            name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.0788f, 5.0689f)
                curveTo(8.8741f, 1.2789f, 15.0438f, 1.3192f, 18.8623f, 5.1378f)
                curveTo(22.6825f, 8.958f, 22.7212f, 15.1313f, 18.9263f, 18.9262f)
                curveTo(15.1314f, 22.7211f, 8.958f, 22.6824f, 5.1379f, 18.8622f)
                curveTo(2.874f, 16.5984f, 1.9392f, 13.5099f, 2.3406f, 10.5812f)
                curveTo(2.3968f, 10.1708f, 2.7751f, 9.8838f, 3.1855f, 9.94f)
                curveTo(3.5959f, 9.9963f, 3.883f, 10.3745f, 3.8267f, 10.7849f)
                curveTo(3.4867f, 13.2652f, 4.2779f, 15.881f, 6.1985f, 17.8016f)
                curveTo(9.443f, 21.0461f, 14.6665f, 21.0646f, 17.8656f, 17.8655f)
                curveTo(21.0647f, 14.6664f, 21.0461f, 9.4429f, 17.8017f, 6.1984f)
                curveTo(14.5588f, 2.9556f, 9.339f, 2.9354f, 6.1395f, 6.1296f)
                lineTo(6.8872f, 6.1333f)
                curveTo(7.3014f, 6.1354f, 7.6355f, 6.4729f, 7.6334f, 6.8871f)
                curveTo(7.6313f, 7.3013f, 7.2938f, 7.6354f, 6.8796f, 7.6333f)
                lineTo(4.3341f, 7.6205f)
                curveTo(3.9228f, 7.6185f, 3.5899f, 7.2856f, 3.5879f, 6.8743f)
                lineTo(3.5751f, 4.3287f)
                curveTo(3.573f, 3.9145f, 3.9071f, 3.5771f, 4.3213f, 3.575f)
                curveTo(4.7355f, 3.5729f, 5.073f, 3.907f, 5.075f, 4.3212f)
                lineTo(5.0788f, 5.0689f)
                close()
                moveTo(12.0f, 7.2499f)
                curveTo(12.4142f, 7.2499f, 12.75f, 7.5857f, 12.75f, 7.9999f)
                verticalLineTo(11.6893f)
                lineTo(15.0303f, 13.9696f)
                curveTo(15.3232f, 14.2625f, 15.3232f, 14.7374f, 15.0303f, 15.0302f)
                curveTo(14.7374f, 15.3231f, 14.2626f, 15.3231f, 13.9697f, 15.0302f)
                lineTo(11.25f, 12.3106f)
                verticalLineTo(7.9999f)
                curveTo(11.25f, 7.5857f, 11.5858f, 7.2499f, 12.0f, 7.2499f)
                close()
            }
        }
            .build()
        return _history!!
    }

private var _history: ImageVector? = null
