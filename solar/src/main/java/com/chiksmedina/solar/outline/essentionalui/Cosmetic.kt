package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Cosmetic: ImageVector
    get() {
        if (_cosmetic != null) {
            return _cosmetic!!
        }
        _cosmetic = Builder(name = "Cosmetic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 5.618f)
                curveTo(7.75f, 4.3171f, 6.3809f, 3.4709f, 5.2174f, 4.0527f)
                lineTo(3.2174f, 5.0527f)
                curveTo(2.6245f, 5.3492f, 2.25f, 5.9551f, 2.25f, 6.618f)
                verticalLineTo(10.2499f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 10.2499f, 1.25f, 10.5857f, 1.25f, 10.9999f)
                verticalLineTo(16.9999f)
                curveTo(1.25f, 19.071f, 2.9289f, 20.7499f, 5.0f, 20.7499f)
                curveTo(7.0711f, 20.7499f, 8.75f, 19.071f, 8.75f, 16.9999f)
                verticalLineTo(10.9999f)
                curveTo(8.75f, 10.5857f, 8.4142f, 10.2499f, 8.0f, 10.2499f)
                horizontalLineTo(7.75f)
                verticalLineTo(5.618f)
                close()
                moveTo(2.75f, 11.7499f)
                horizontalLineTo(7.25f)
                verticalLineTo(16.9999f)
                curveTo(7.25f, 18.2426f, 6.2426f, 19.2499f, 5.0f, 19.2499f)
                curveTo(3.7574f, 19.2499f, 2.75f, 18.2426f, 2.75f, 16.9999f)
                verticalLineTo(11.7499f)
                close()
                moveTo(6.25f, 10.2499f)
                verticalLineTo(5.618f)
                curveTo(6.25f, 5.4321f, 6.0544f, 5.3113f, 5.8882f, 5.3944f)
                lineTo(3.8882f, 6.3944f)
                curveTo(3.8035f, 6.4367f, 3.75f, 6.5233f, 3.75f, 6.618f)
                verticalLineTo(10.2499f)
                horizontalLineTo(6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 4.2499f)
                curveTo(13.0482f, 4.2499f, 10.25f, 7.0482f, 10.25f, 10.4999f)
                curveTo(10.25f, 13.6979f, 12.6518f, 16.3349f, 15.75f, 16.7054f)
                verticalLineTo(19.2499f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 19.2499f, 12.75f, 19.5857f, 12.75f, 19.9999f)
                curveTo(12.75f, 20.4142f, 13.0858f, 20.7499f, 13.5f, 20.7499f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 20.7499f, 20.25f, 20.4142f, 20.25f, 19.9999f)
                curveTo(20.25f, 19.5857f, 19.9142f, 19.2499f, 19.5f, 19.2499f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.7054f)
                curveTo(20.3482f, 16.3349f, 22.75f, 13.6979f, 22.75f, 10.4999f)
                curveTo(22.75f, 7.0482f, 19.9518f, 4.2499f, 16.5f, 4.2499f)
                close()
                moveTo(16.5f, 15.2499f)
                curveTo(19.1234f, 15.2499f, 21.25f, 13.1233f, 21.25f, 10.4999f)
                curveTo(21.25f, 7.8766f, 19.1234f, 5.7499f, 16.5f, 5.7499f)
                curveTo(13.8766f, 5.7499f, 11.75f, 7.8766f, 11.75f, 10.4999f)
                curveTo(11.75f, 13.1233f, 13.8766f, 15.2499f, 16.5f, 15.2499f)
                close()
            }
        }
        .build()
        return _cosmetic!!
    }

private var _cosmetic: ImageVector? = null
