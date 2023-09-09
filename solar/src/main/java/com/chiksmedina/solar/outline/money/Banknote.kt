package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

public val MoneyGroup.Banknote: ImageVector
    get() {
        if (_banknote != null) {
            return _banknote!!
        }
        _banknote = Builder(name = "Banknote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.2102f, 5.8304f)
                curveTo(17.4287f, 5.7509f, 16.4201f, 5.75f, 15.0f, 5.75f)
                lineTo(9.0f, 5.75f)
                curveTo(7.5799f, 5.75f, 6.5713f, 5.7509f, 5.7898f, 5.8304f)
                curveTo(5.0207f, 5.9086f, 4.5551f, 6.0567f, 4.1944f, 6.2977f)
                curveTo(3.8395f, 6.5348f, 3.5348f, 6.8395f, 3.2977f, 7.1944f)
                curveTo(3.0567f, 7.5551f, 2.9086f, 8.0207f, 2.8304f, 8.7898f)
                curveTo(2.7509f, 9.5713f, 2.75f, 10.5799f, 2.75f, 12.0f)
                curveTo(2.75f, 13.4201f, 2.7509f, 14.4287f, 2.8304f, 15.2102f)
                curveTo(2.9086f, 15.9793f, 3.0567f, 16.4449f, 3.2977f, 16.8056f)
                curveTo(3.5348f, 17.1605f, 3.8395f, 17.4652f, 4.1944f, 17.7023f)
                curveTo(4.5551f, 17.9433f, 5.0207f, 18.0914f, 5.7898f, 18.1696f)
                curveTo(6.5713f, 18.2491f, 7.5799f, 18.25f, 9.0f, 18.25f)
                horizontalLineTo(15.0f)
                curveTo(16.4201f, 18.25f, 17.4287f, 18.2491f, 18.2102f, 18.1696f)
                curveTo(18.9793f, 18.0914f, 19.4449f, 17.9433f, 19.8056f, 17.7023f)
                curveTo(20.1605f, 17.4652f, 20.4652f, 17.1605f, 20.7023f, 16.8056f)
                curveTo(20.9433f, 16.4449f, 21.0914f, 15.9793f, 21.1696f, 15.2102f)
                curveTo(21.2491f, 14.4287f, 21.25f, 13.4201f, 21.25f, 12.0f)
                curveTo(21.25f, 10.5799f, 21.2491f, 9.5713f, 21.1696f, 8.7898f)
                curveTo(21.0914f, 8.0207f, 20.9433f, 7.5551f, 20.7023f, 7.1944f)
                curveTo(20.4652f, 6.8395f, 20.1605f, 6.5348f, 19.8056f, 6.2977f)
                curveTo(19.4449f, 6.0567f, 18.9793f, 5.9086f, 18.2102f, 5.8304f)
                close()
                moveTo(18.3621f, 4.3381f)
                curveTo(19.2497f, 4.4284f, 19.9907f, 4.6174f, 20.639f, 5.0505f)
                curveTo(21.1576f, 5.3971f, 21.6029f, 5.8424f, 21.9495f, 6.361f)
                curveTo(22.3826f, 7.0093f, 22.5716f, 7.7503f, 22.6619f, 8.6379f)
                curveTo(22.75f, 9.5043f, 22.75f, 10.5892f, 22.75f, 11.9584f)
                verticalLineTo(12.0416f)
                curveTo(22.75f, 13.4108f, 22.75f, 14.4957f, 22.6619f, 15.3621f)
                curveTo(22.5716f, 16.2497f, 22.3826f, 16.9907f, 21.9495f, 17.639f)
                curveTo(21.6029f, 18.1576f, 21.1576f, 18.6029f, 20.639f, 18.9495f)
                curveTo(19.9907f, 19.3826f, 19.2497f, 19.5716f, 18.3621f, 19.6619f)
                curveTo(17.4957f, 19.75f, 16.4108f, 19.75f, 15.0416f, 19.75f)
                horizontalLineTo(8.9584f)
                curveTo(7.5892f, 19.75f, 6.5043f, 19.75f, 5.6379f, 19.6619f)
                curveTo(4.7503f, 19.5716f, 4.0093f, 19.3826f, 3.361f, 18.9495f)
                curveTo(2.8424f, 18.6029f, 2.3971f, 18.1576f, 2.0505f, 17.639f)
                curveTo(1.6174f, 16.9907f, 1.4284f, 16.2497f, 1.3381f, 15.3621f)
                curveTo(1.25f, 14.4957f, 1.25f, 13.4108f, 1.25f, 12.0416f)
                verticalLineTo(11.9584f)
                curveTo(1.25f, 10.5892f, 1.25f, 9.5043f, 1.3381f, 8.6379f)
                curveTo(1.4284f, 7.7503f, 1.6174f, 7.0093f, 2.0505f, 6.361f)
                curveTo(2.3971f, 5.8424f, 2.8424f, 5.3971f, 3.361f, 5.0505f)
                curveTo(4.0093f, 4.6174f, 4.7503f, 4.4284f, 5.6379f, 4.3381f)
                curveTo(6.5043f, 4.25f, 7.5892f, 4.25f, 8.9584f, 4.25f)
                lineTo(15.0416f, 4.25f)
                curveTo(16.4108f, 4.25f, 17.4957f, 4.25f, 18.3621f, 4.3381f)
                close()
                moveTo(5.5f, 8.25f)
                curveTo(5.9142f, 8.25f, 6.25f, 8.5858f, 6.25f, 9.0f)
                lineTo(6.25f, 15.0f)
                curveTo(6.25f, 15.4142f, 5.9142f, 15.75f, 5.5f, 15.75f)
                curveTo(5.0858f, 15.75f, 4.75f, 15.4142f, 4.75f, 15.0f)
                lineTo(4.75f, 9.0f)
                curveTo(4.75f, 8.5858f, 5.0858f, 8.25f, 5.5f, 8.25f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
                moveTo(18.5f, 8.25f)
                curveTo(18.9142f, 8.25f, 19.25f, 8.5858f, 19.25f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(19.25f, 15.4142f, 18.9142f, 15.75f, 18.5f, 15.75f)
                curveTo(18.0858f, 15.75f, 17.75f, 15.4142f, 17.75f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(17.75f, 8.5858f, 18.0858f, 8.25f, 18.5f, 8.25f)
                close()
            }
        }
        .build()
        return _banknote!!
    }

private var _banknote: ImageVector? = null
