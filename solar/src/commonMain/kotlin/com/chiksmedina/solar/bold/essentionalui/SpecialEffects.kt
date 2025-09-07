package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.SpecialEffects: ImageVector
    get() {
        if (_specialEffects != null) {
            return _specialEffects!!
        }
        _specialEffects = Builder(
            name = "SpecialEffects", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(6.75f, 11.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 11.25f, 10.75f, 11.5858f, 10.75f, 12.0f)
                curveTo(10.75f, 12.4142f, 10.4142f, 12.75f, 10.0f, 12.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(16.0f)
                curveTo(6.75f, 16.4142f, 6.4142f, 16.75f, 6.0f, 16.75f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                verticalLineTo(12.0f)
                verticalLineTo(8.0f)
                curveTo(5.25f, 7.5858f, 5.5858f, 7.25f, 6.0f, 7.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 7.25f, 10.75f, 7.5858f, 10.75f, 8.0f)
                curveTo(10.75f, 8.4142f, 10.4142f, 8.75f, 10.0f, 8.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(11.55f, 7.4f)
                curveTo(11.8814f, 7.1515f, 12.3515f, 7.2186f, 12.6f, 7.55f)
                lineTo(15.0f, 10.75f)
                lineTo(17.4f, 7.55f)
                curveTo(17.6485f, 7.2186f, 18.1186f, 7.1515f, 18.45f, 7.4f)
                curveTo(18.7814f, 7.6485f, 18.8485f, 8.1186f, 18.6f, 8.45f)
                lineTo(15.9375f, 12.0f)
                lineTo(18.6f, 15.55f)
                curveTo(18.8485f, 15.8814f, 18.7814f, 16.3515f, 18.45f, 16.6f)
                curveTo(18.1186f, 16.8485f, 17.6485f, 16.7814f, 17.4f, 16.45f)
                lineTo(15.0f, 13.25f)
                lineTo(12.6f, 16.45f)
                curveTo(12.3515f, 16.7814f, 11.8814f, 16.8485f, 11.55f, 16.6f)
                curveTo(11.2186f, 16.3515f, 11.1515f, 15.8814f, 11.4f, 15.55f)
                lineTo(14.0625f, 12.0f)
                lineTo(11.4f, 8.45f)
                curveTo(11.1515f, 8.1186f, 11.2186f, 7.6485f, 11.55f, 7.4f)
                close()
            }
        }
            .build()
        return _specialEffects!!
    }

private var _specialEffects: ImageVector? = null
