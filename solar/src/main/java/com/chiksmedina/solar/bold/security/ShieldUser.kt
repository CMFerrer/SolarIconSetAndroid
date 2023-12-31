package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.ShieldUser: ImageVector
    get() {
        if (_shieldUser != null) {
            return _shieldUser!!
        }
        _shieldUser = Builder(
            name = "ShieldUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 10.4167f)
                curveTo(3.0f, 7.2191f, 3.0f, 5.6203f, 3.3775f, 5.0824f)
                curveTo(3.755f, 4.5445f, 5.2583f, 4.03f, 8.2649f, 3.0008f)
                lineTo(8.8377f, 2.8047f)
                curveTo(10.405f, 2.2682f, 11.1886f, 2.0f, 12.0f, 2.0f)
                curveTo(12.8114f, 2.0f, 13.595f, 2.2682f, 15.1623f, 2.8047f)
                lineTo(15.7351f, 3.0008f)
                curveTo(18.7417f, 4.03f, 20.245f, 4.5445f, 20.6225f, 5.0824f)
                curveTo(21.0f, 5.6203f, 21.0f, 7.2191f, 21.0f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(21.0f, 17.6294f, 16.761f, 20.3655f, 14.1014f, 21.5273f)
                curveTo(13.38f, 21.8424f, 13.0193f, 22.0f, 12.0f, 22.0f)
                curveTo(10.9807f, 22.0f, 10.62f, 21.8424f, 9.8986f, 21.5273f)
                curveTo(7.239f, 20.3655f, 3.0f, 17.6294f, 3.0f, 11.9914f)
                verticalLineTo(10.4167f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 10.1046f, 13.1046f, 11.0f, 12.0f, 11.0f)
                curveTo(10.8954f, 11.0f, 10.0f, 10.1046f, 10.0f, 9.0f)
                curveTo(10.0f, 7.8954f, 10.8954f, 7.0f, 12.0f, 7.0f)
                curveTo(13.1046f, 7.0f, 14.0f, 7.8954f, 14.0f, 9.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(16.0f, 17.0f, 16.0f, 16.1046f, 16.0f, 15.0f)
                curveTo(16.0f, 13.8954f, 14.2091f, 13.0f, 12.0f, 13.0f)
                curveTo(9.7909f, 13.0f, 8.0f, 13.8954f, 8.0f, 15.0f)
                curveTo(8.0f, 16.1046f, 8.0f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
            .build()
        return _shieldUser!!
    }

private var _shieldUser: ImageVector? = null
