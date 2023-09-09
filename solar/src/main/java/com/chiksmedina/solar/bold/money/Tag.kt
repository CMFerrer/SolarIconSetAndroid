package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1226f, 12.816f)
                curveTo(2.4102f, 13.8186f, 3.183f, 14.5914f, 4.7285f, 16.1369f)
                lineTo(6.5581f, 17.9665f)
                curveTo(9.2471f, 20.6555f, 10.5916f, 22.0f, 12.2623f, 22.0f)
                curveTo(13.933f, 22.0f, 15.2775f, 20.6555f, 17.9665f, 17.9665f)
                curveTo(20.6555f, 15.2775f, 22.0f, 13.933f, 22.0f, 12.2623f)
                curveTo(22.0f, 10.5916f, 20.6555f, 9.2471f, 17.9665f, 6.5581f)
                lineTo(16.1369f, 4.7285f)
                curveTo(14.5914f, 3.183f, 13.8186f, 2.4102f, 12.816f, 2.1226f)
                curveTo(11.8134f, 1.8351f, 10.7485f, 2.0808f, 8.6187f, 2.5723f)
                lineTo(7.3906f, 2.8557f)
                curveTo(5.5988f, 3.2692f, 4.7029f, 3.476f, 4.0894f, 4.0894f)
                curveTo(3.476f, 4.7029f, 3.2692f, 5.5988f, 2.8557f, 7.3906f)
                lineTo(2.5723f, 8.6187f)
                curveTo(2.0808f, 10.7485f, 1.8351f, 11.8134f, 2.1226f, 12.816f)
                close()
                moveTo(10.1234f, 7.271f)
                curveTo(10.911f, 8.0586f, 10.911f, 9.3355f, 10.1234f, 10.1231f)
                curveTo(9.3358f, 10.9107f, 8.0589f, 10.9107f, 7.2713f, 10.1231f)
                curveTo(6.4837f, 9.3355f, 6.4837f, 8.0586f, 7.2713f, 7.271f)
                curveTo(8.0589f, 6.4834f, 9.3358f, 6.4834f, 10.1234f, 7.271f)
                close()
                moveTo(19.0511f, 12.0511f)
                lineTo(12.0721f, 19.0303f)
                curveTo(11.7792f, 19.3232f, 11.3043f, 19.3232f, 11.0114f, 19.0303f)
                curveTo(10.7185f, 18.7375f, 10.7185f, 18.2626f, 11.0114f, 17.9697f)
                lineTo(17.9904f, 10.9904f)
                curveTo(18.2833f, 10.6975f, 18.7582f, 10.6975f, 19.0511f, 10.9904f)
                curveTo(19.344f, 11.2833f, 19.344f, 11.7582f, 19.0511f, 12.0511f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
