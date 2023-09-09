package com.chiksmedina.solar.boldduotone.money

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
import com.chiksmedina.solar.boldduotone.MoneyGroup

public val MoneyGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.7285f, 16.1369f)
                curveTo(3.183f, 14.5914f, 2.4102f, 13.8186f, 2.1226f, 12.816f)
                curveTo(1.8351f, 11.8134f, 2.0808f, 10.7485f, 2.5723f, 8.6187f)
                lineTo(2.8557f, 7.3906f)
                curveTo(3.2692f, 5.5988f, 3.476f, 4.7029f, 4.0894f, 4.0894f)
                curveTo(4.7029f, 3.476f, 5.5988f, 3.2692f, 7.3906f, 2.8557f)
                lineTo(8.6187f, 2.5723f)
                curveTo(10.7485f, 2.0808f, 11.8134f, 1.8351f, 12.816f, 2.1226f)
                curveTo(13.8186f, 2.4102f, 14.5914f, 3.183f, 16.1369f, 4.7285f)
                lineTo(17.9665f, 6.5581f)
                lineTo(17.9665f, 6.5581f)
                curveTo(20.6555f, 9.2471f, 22.0f, 10.5916f, 22.0f, 12.2623f)
                curveTo(22.0f, 13.933f, 20.6555f, 15.2775f, 17.9665f, 17.9665f)
                lineTo(17.9665f, 17.9665f)
                lineTo(17.9665f, 17.9665f)
                curveTo(15.2775f, 20.6555f, 13.933f, 22.0f, 12.2623f, 22.0f)
                curveTo(10.5916f, 22.0f, 9.2471f, 20.6555f, 6.5581f, 17.9665f)
                lineTo(6.5581f, 17.9665f)
                lineTo(4.7285f, 16.1369f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1235f, 7.2713f)
                curveTo(10.911f, 8.0589f, 10.911f, 9.3359f, 10.1235f, 10.1235f)
                curveTo(9.3359f, 10.911f, 8.0589f, 10.911f, 7.2713f, 10.1235f)
                curveTo(6.4838f, 9.3359f, 6.4838f, 8.0589f, 7.2713f, 7.2713f)
                curveTo(8.0589f, 6.4838f, 9.3359f, 6.4838f, 10.1235f, 7.2713f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0512f, 12.0514f)
                lineTo(12.0721f, 19.0307f)
                curveTo(11.7793f, 19.3236f, 11.3044f, 19.3236f, 11.0115f, 19.0307f)
                curveTo(10.7186f, 18.7378f, 10.7186f, 18.263f, 11.0115f, 17.9701f)
                lineTo(17.9905f, 10.9908f)
                curveTo(18.2834f, 10.6979f, 18.7582f, 10.6979f, 19.0511f, 10.9908f)
                curveTo(19.344f, 11.2837f, 19.344f, 11.7586f, 19.0512f, 12.0514f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
