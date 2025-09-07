package com.chiksmedina.solar.boldduotone.security

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
import com.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(
            name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 13.6394f, 2.425f, 14.1915f, 3.2749f, 15.2957f)
                curveTo(4.972f, 17.5004f, 7.8181f, 20.0f, 12.0f, 20.0f)
                curveTo(16.1819f, 20.0f, 19.028f, 17.5004f, 20.7251f, 15.2957f)
                curveTo(21.575f, 14.1915f, 22.0f, 13.6394f, 22.0f, 12.0f)
                curveTo(22.0f, 10.3606f, 21.575f, 9.8085f, 20.7251f, 8.7043f)
                curveTo(19.028f, 6.4996f, 16.1819f, 4.0f, 12.0f, 4.0f)
                curveTo(7.8181f, 4.0f, 4.972f, 6.4996f, 3.2749f, 8.7043f)
                curveTo(2.425f, 9.8085f, 2.0f, 10.3606f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 10.7574f, 10.7574f, 9.75f, 12.0f, 9.75f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                curveTo(14.25f, 13.2426f, 13.2426f, 14.25f, 12.0f, 14.25f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                close()
            }
        }
            .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
