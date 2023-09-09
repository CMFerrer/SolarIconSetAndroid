package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.ScreenShare: ImageVector
    get() {
        if (_screenShare != null) {
            return _screenShare!!
        }
        _screenShare = Builder(name = "ScreenShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0303f, 7.4697f)
                curveTo(14.7374f, 7.1768f, 14.2626f, 7.1768f, 13.9697f, 7.4697f)
                lineTo(11.4697f, 9.9697f)
                curveTo(11.1768f, 10.2626f, 11.1768f, 10.7374f, 11.4697f, 11.0303f)
                curveTo(11.7626f, 11.3232f, 12.2374f, 11.3232f, 12.5303f, 11.0303f)
                lineTo(13.75f, 9.8107f)
                verticalLineTo(16.0f)
                curveTo(13.75f, 16.4142f, 14.0858f, 16.75f, 14.5f, 16.75f)
                curveTo(14.9142f, 16.75f, 15.25f, 16.4142f, 15.25f, 16.0f)
                verticalLineTo(9.8107f)
                lineTo(16.4697f, 11.0303f)
                curveTo(16.7626f, 11.3232f, 17.2374f, 11.3232f, 17.5303f, 11.0303f)
                curveTo(17.8232f, 10.7374f, 17.8232f, 10.2626f, 17.5303f, 9.9697f)
                lineTo(15.0303f, 7.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.9451f, 1.25f)
                horizontalLineTo(15.0549f)
                curveTo(16.4225f, 1.25f, 17.5248f, 1.25f, 18.3918f, 1.3665f)
                curveTo(19.2919f, 1.4875f, 20.0497f, 1.7464f, 20.6517f, 2.3484f)
                curveTo(21.2536f, 2.9503f, 21.5125f, 3.7081f, 21.6335f, 4.6083f)
                curveTo(21.75f, 5.4752f, 21.75f, 6.5775f, 21.75f, 7.9451f)
                verticalLineTo(16.0549f)
                curveTo(21.75f, 17.4225f, 21.75f, 18.5248f, 21.6335f, 19.3918f)
                curveTo(21.5125f, 20.2919f, 21.2536f, 21.0497f, 20.6517f, 21.6517f)
                curveTo(20.0497f, 22.2536f, 19.2919f, 22.5125f, 18.3918f, 22.6335f)
                curveTo(17.5248f, 22.75f, 16.4225f, 22.75f, 15.0549f, 22.75f)
                horizontalLineTo(13.9451f)
                curveTo(12.5775f, 22.75f, 11.4752f, 22.75f, 10.6083f, 22.6335f)
                curveTo(9.7081f, 22.5125f, 8.9503f, 22.2536f, 8.3483f, 21.6517f)
                curveTo(7.9486f, 21.2518f, 7.7001f, 20.7832f, 7.5428f, 20.2498f)
                curveTo(6.5916f, 20.2486f, 5.799f, 20.2381f, 5.1569f, 20.1518f)
                curveTo(4.3929f, 20.0491f, 3.7306f, 19.8268f, 3.2019f, 19.2981f)
                curveTo(2.6732f, 18.7694f, 2.4509f, 18.1071f, 2.3482f, 17.3431f)
                curveTo(2.25f, 16.6123f, 2.25f, 15.6865f, 2.25f, 14.5537f)
                verticalLineTo(9.4463f)
                curveTo(2.25f, 8.3135f, 2.25f, 7.3877f, 2.3482f, 6.6569f)
                curveTo(2.4509f, 5.8929f, 2.6732f, 5.2306f, 3.2019f, 4.7019f)
                curveTo(3.7306f, 4.1732f, 4.3929f, 3.9509f, 5.1569f, 3.8482f)
                curveTo(5.799f, 3.7619f, 6.5916f, 3.7514f, 7.5428f, 3.7502f)
                curveTo(7.7001f, 3.2168f, 7.9486f, 2.7482f, 8.3483f, 2.3484f)
                curveTo(8.9503f, 1.7464f, 9.7081f, 1.4875f, 10.6083f, 1.3665f)
                curveTo(11.4752f, 1.25f, 12.5775f, 1.25f, 13.9451f, 1.25f)
                close()
                moveTo(7.25f, 16.0549f)
                curveTo(7.25f, 17.1048f, 7.25f, 17.9983f, 7.3027f, 18.7491f)
                curveTo(6.4683f, 18.7459f, 5.848f, 18.7312f, 5.3568f, 18.6652f)
                curveTo(4.7591f, 18.5848f, 4.4661f, 18.441f, 4.2626f, 18.2374f)
                curveTo(4.059f, 18.0339f, 3.9152f, 17.7409f, 3.8348f, 17.1432f)
                curveTo(3.7516f, 16.5241f, 3.75f, 15.6997f, 3.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(3.75f, 8.3003f, 3.7516f, 7.4759f, 3.8348f, 6.8568f)
                curveTo(3.9152f, 6.2591f, 4.059f, 5.9661f, 4.2626f, 5.7626f)
                curveTo(4.4661f, 5.559f, 4.7591f, 5.4152f, 5.3568f, 5.3348f)
                curveTo(5.848f, 5.2688f, 6.4683f, 5.2541f, 7.3027f, 5.2509f)
                curveTo(7.25f, 6.0017f, 7.25f, 6.8952f, 7.25f, 7.9451f)
                verticalLineTo(16.0549f)
                close()
                moveTo(10.8081f, 2.8531f)
                curveTo(10.0743f, 2.9518f, 9.6858f, 3.1323f, 9.409f, 3.409f)
                curveTo(9.1322f, 3.6858f, 8.9518f, 4.0743f, 8.8532f, 4.8081f)
                curveTo(8.7516f, 5.5635f, 8.75f, 6.5646f, 8.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(8.75f, 17.4354f, 8.7516f, 18.4365f, 8.8532f, 19.1919f)
                curveTo(8.9518f, 19.9257f, 9.1322f, 20.3142f, 9.409f, 20.591f)
                curveTo(9.6858f, 20.8678f, 10.0743f, 21.0482f, 10.8081f, 21.1469f)
                curveTo(11.5635f, 21.2484f, 12.5646f, 21.25f, 14.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(16.4354f, 21.25f, 17.4365f, 21.2484f, 18.1919f, 21.1469f)
                curveTo(18.9257f, 21.0482f, 19.3142f, 20.8678f, 19.591f, 20.591f)
                curveTo(19.8678f, 20.3142f, 20.0482f, 19.9257f, 20.1469f, 19.1919f)
                curveTo(20.2484f, 18.4365f, 20.25f, 17.4354f, 20.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(20.25f, 6.5646f, 20.2484f, 5.5635f, 20.1469f, 4.8081f)
                curveTo(20.0482f, 4.0743f, 19.8678f, 3.6858f, 19.591f, 3.409f)
                curveTo(19.3142f, 3.1323f, 18.9257f, 2.9518f, 18.1919f, 2.8531f)
                curveTo(17.4365f, 2.7516f, 16.4354f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(14.0f)
                curveTo(12.5646f, 2.75f, 11.5635f, 2.7516f, 10.8081f, 2.8531f)
                close()
            }
        }
        .build()
        return _screenShare!!
    }

private var _screenShare: ImageVector? = null
