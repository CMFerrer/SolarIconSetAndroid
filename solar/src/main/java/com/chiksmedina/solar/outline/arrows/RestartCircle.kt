package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.RestartCircle: ImageVector
    get() {
        if (_restartCircle != null) {
            return _restartCircle!!
        }
        _restartCircle = Builder(
            name = "RestartCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.7275f, 6.0f)
                curveTo(16.7275f, 5.5858f, 16.3917f, 5.25f, 15.9775f, 5.25f)
                curveTo(15.5633f, 5.25f, 15.2275f, 5.5858f, 15.2275f, 6.0f)
                verticalLineTo(7.0232f)
                curveTo(12.9877f, 5.4696f, 9.9111f, 5.7078f, 7.928f, 7.738f)
                curveTo(5.6907f, 10.0283f, 5.6907f, 13.7346f, 7.928f, 16.0249f)
                curveTo(10.1748f, 18.325f, 13.8252f, 18.325f, 16.072f, 16.0249f)
                curveTo(17.3754f, 14.6907f, 17.9168f, 12.8781f, 17.7055f, 11.1509f)
                curveTo(17.6552f, 10.7398f, 17.2812f, 10.4472f, 16.87f, 10.4975f)
                curveTo(16.4589f, 10.5478f, 16.1663f, 10.9219f, 16.2166f, 11.333f)
                curveTo(16.3757f, 12.6337f, 15.9667f, 13.9861f, 14.999f, 14.9767f)
                curveTo(13.3407f, 16.6744f, 10.6593f, 16.6744f, 9.001f, 14.9767f)
                curveTo(7.333f, 13.2692f, 7.333f, 10.4937f, 9.001f, 8.7862f)
                curveTo(10.324f, 7.4318f, 12.298f, 7.1579f, 13.8844f, 7.9645f)
                horizontalLineTo(13.3258f)
                curveTo(12.9116f, 7.9645f, 12.5758f, 8.3003f, 12.5758f, 8.7145f)
                curveTo(12.5758f, 9.1287f, 12.9116f, 9.4645f, 13.3258f, 9.4645f)
                horizontalLineTo(15.9775f)
                curveTo(16.3917f, 9.4645f, 16.7275f, 9.1287f, 16.7275f, 8.7145f)
                verticalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
            .build()
        return _restartCircle!!
    }

private var _restartCircle: ImageVector? = null
