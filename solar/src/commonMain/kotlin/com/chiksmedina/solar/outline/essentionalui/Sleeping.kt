package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Sleeping: ImageVector
    get() {
        if (_sleeping != null) {
            return _sleeping!!
        }
        _sleeping = Builder(
            name = "Sleeping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.75f, 6.0f)
                curveTo(2.75f, 5.5858f, 2.4142f, 5.25f, 2.0f, 5.25f)
                curveTo(1.5858f, 5.25f, 1.25f, 5.5858f, 1.25f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.25f, 18.4142f, 1.5858f, 18.75f, 2.0f, 18.75f)
                curveTo(2.4142f, 18.75f, 2.75f, 18.4142f, 2.75f, 18.0f)
                verticalLineTo(16.75f)
                lineTo(12.0f, 16.75f)
                lineTo(21.25f, 16.75f)
                verticalLineTo(18.0f)
                curveTo(21.25f, 18.4142f, 21.5858f, 18.75f, 22.0f, 18.75f)
                curveTo(22.4142f, 18.75f, 22.75f, 18.4142f, 22.75f, 18.0f)
                verticalLineTo(16.0048f)
                lineTo(22.75f, 16.0f)
                lineTo(22.75f, 15.9952f)
                lineTo(22.75f, 15.4694f)
                curveTo(22.7503f, 13.6408f, 22.7505f, 12.5245f, 22.4273f, 11.6009f)
                curveTo(21.8494f, 9.9492f, 20.5508f, 8.6506f, 18.8991f, 8.0727f)
                curveTo(17.9755f, 7.7495f, 16.8592f, 7.7497f, 15.0306f, 7.75f)
                lineTo(14.7315f, 7.7499f)
                curveTo(14.0576f, 7.7494f, 13.5358f, 7.7489f, 13.0917f, 7.9043f)
                curveTo(12.3018f, 8.1807f, 11.6807f, 8.8018f, 11.4043f, 9.5917f)
                curveTo(11.2489f, 10.0358f, 11.2493f, 10.5577f, 11.2499f, 11.2315f)
                lineTo(11.25f, 15.25f)
                horizontalLineTo(2.75f)
                verticalLineTo(6.0f)
                close()
                moveTo(21.2498f, 15.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.3571f)
                curveTo(12.75f, 10.4964f, 12.7606f, 10.2573f, 12.8201f, 10.0872f)
                curveTo(12.9458f, 9.7281f, 13.2281f, 9.4458f, 13.5871f, 9.3202f)
                curveTo(13.7573f, 9.2606f, 13.9964f, 9.25f, 14.8571f, 9.25f)
                curveTo(16.9148f, 9.25f, 17.7524f, 9.2606f, 18.4037f, 9.4885f)
                curveTo(19.6245f, 9.9157f, 20.5843f, 10.8755f, 21.0115f, 12.0963f)
                curveTo(21.2243f, 12.7045f, 21.2476f, 13.4751f, 21.2498f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0f, 7.75f)
                curveTo(5.2051f, 7.75f, 3.75f, 9.2051f, 3.75f, 11.0f)
                curveTo(3.75f, 12.7949f, 5.2051f, 14.25f, 7.0f, 14.25f)
                curveTo(8.7949f, 14.25f, 10.25f, 12.7949f, 10.25f, 11.0f)
                curveTo(10.25f, 9.2051f, 8.7949f, 7.75f, 7.0f, 7.75f)
                close()
                moveTo(5.25f, 11.0f)
                curveTo(5.25f, 10.0335f, 6.0335f, 9.25f, 7.0f, 9.25f)
                curveTo(7.9665f, 9.25f, 8.75f, 10.0335f, 8.75f, 11.0f)
                curveTo(8.75f, 11.9665f, 7.9665f, 12.75f, 7.0f, 12.75f)
                curveTo(6.0335f, 12.75f, 5.25f, 11.9665f, 5.25f, 11.0f)
                close()
            }
        }
            .build()
        return _sleeping!!
    }

private var _sleeping: ImageVector? = null
