package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(
            name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 13.3807f, 5.1193f, 14.5f, 6.5f, 14.5f)
                curveTo(7.8807f, 14.5f, 9.0f, 13.3807f, 9.0f, 12.0f)
                curveTo(9.0f, 10.6193f, 7.8807f, 9.5f, 6.5f, 9.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 6.5f)
                lineTo(9.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 17.5f)
                lineTo(9.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 21.0f)
                curveTo(17.8807f, 21.0f, 19.0f, 19.8807f, 19.0f, 18.5f)
                curveTo(19.0f, 17.1193f, 17.8807f, 16.0f, 16.5f, 16.0f)
                curveTo(15.1193f, 16.0f, 14.0f, 17.1193f, 14.0f, 18.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.665f, 6.75f)
                curveTo(17.9746f, 7.9457f, 16.4457f, 8.3554f, 15.2499f, 7.6651f)
                curveTo(14.0542f, 6.9747f, 13.6445f, 5.4457f, 14.3349f, 4.25f)
                curveTo(15.0252f, 3.0543f, 16.5542f, 2.6446f, 17.7499f, 3.3349f)
            }
        }
            .build()
        return _share!!
    }

private var _share: ImageVector? = null
