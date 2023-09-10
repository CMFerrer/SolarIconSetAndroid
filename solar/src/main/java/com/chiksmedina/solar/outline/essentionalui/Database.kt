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

val EssentionalUiGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(
            name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.25f, 6.0f)
                curveTo(3.25f, 4.4583f, 4.4803f, 3.2645f, 6.0077f, 2.5008f)
                curveTo(7.58f, 1.7146f, 9.6997f, 1.25f, 12.0f, 1.25f)
                curveTo(14.3003f, 1.25f, 16.42f, 1.7146f, 17.9923f, 2.5008f)
                curveTo(19.5197f, 3.2645f, 20.75f, 4.4583f, 20.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(20.75f, 19.5417f, 19.5197f, 20.7355f, 17.9923f, 21.4992f)
                curveTo(16.42f, 22.2854f, 14.3003f, 22.75f, 12.0f, 22.75f)
                curveTo(9.6997f, 22.75f, 7.58f, 22.2854f, 6.0077f, 21.4992f)
                curveTo(4.4803f, 20.7355f, 3.25f, 19.5417f, 3.25f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(4.75f, 6.0f)
                curveTo(4.75f, 5.3326f, 5.3106f, 4.5264f, 6.6786f, 3.8424f)
                curveTo(8.0017f, 3.1808f, 9.882f, 2.75f, 12.0f, 2.75f)
                curveTo(14.118f, 2.75f, 15.9983f, 3.1808f, 17.3214f, 3.8424f)
                curveTo(18.6894f, 4.5264f, 19.25f, 5.3326f, 19.25f, 6.0f)
                curveTo(19.25f, 6.6674f, 18.6894f, 7.4736f, 17.3214f, 8.1576f)
                curveTo(15.9983f, 8.8192f, 14.118f, 9.25f, 12.0f, 9.25f)
                curveTo(9.882f, 9.25f, 8.0017f, 8.8192f, 6.6786f, 8.1576f)
                curveTo(5.3106f, 7.4736f, 4.75f, 6.6674f, 4.75f, 6.0f)
                close()
                moveTo(4.75f, 18.0f)
                curveTo(4.75f, 18.6674f, 5.3106f, 19.4736f, 6.6786f, 20.1576f)
                curveTo(8.0017f, 20.8192f, 9.882f, 21.25f, 12.0f, 21.25f)
                curveTo(14.118f, 21.25f, 15.9983f, 20.8192f, 17.3214f, 20.1576f)
                curveTo(18.6894f, 19.4736f, 19.25f, 18.6674f, 19.25f, 18.0f)
                verticalLineTo(14.7072f)
                curveTo(18.8733f, 15.0077f, 18.4459f, 15.2724f, 17.9923f, 15.4992f)
                curveTo(16.42f, 16.2854f, 14.3003f, 16.75f, 12.0f, 16.75f)
                curveTo(9.6997f, 16.75f, 7.58f, 16.2854f, 6.0077f, 15.4992f)
                curveTo(5.5541f, 15.2724f, 5.1267f, 15.0077f, 4.75f, 14.7072f)
                verticalLineTo(18.0f)
                close()
                moveTo(19.25f, 8.7072f)
                verticalLineTo(12.0f)
                curveTo(19.25f, 12.6674f, 18.6894f, 13.4736f, 17.3214f, 14.1576f)
                curveTo(15.9983f, 14.8192f, 14.118f, 15.25f, 12.0f, 15.25f)
                curveTo(9.882f, 15.25f, 8.0017f, 14.8192f, 6.6786f, 14.1576f)
                curveTo(5.3106f, 13.4736f, 4.75f, 12.6674f, 4.75f, 12.0f)
                verticalLineTo(8.7072f)
                curveTo(5.1267f, 9.0077f, 5.5541f, 9.2725f, 6.0077f, 9.4993f)
                curveTo(7.58f, 10.2854f, 9.6997f, 10.75f, 12.0f, 10.75f)
                curveTo(14.3003f, 10.75f, 16.42f, 10.2854f, 17.9923f, 9.4993f)
                curveTo(18.4459f, 9.2725f, 18.8733f, 9.0077f, 19.25f, 8.7072f)
                close()
            }
        }
            .build()
        return _database!!
    }

private var _database: ImageVector? = null
