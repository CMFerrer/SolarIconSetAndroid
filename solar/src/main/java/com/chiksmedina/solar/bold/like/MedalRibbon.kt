package com.chiksmedina.solar.bold.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.LikeGroup

public val LikeGroup.MedalRibbon: ImageVector
    get() {
        if (_medalRibbon != null) {
            return _medalRibbon!!
        }
        _medalRibbon = Builder(name = "MedalRibbon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 12.866f, 15.866f, 16.0f, 12.0f, 16.0f)
                curveTo(8.134f, 16.0f, 5.0f, 12.866f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.093f, 15.9414f)
                lineTo(6.7142f, 17.323f)
                curveTo(6.0859f, 19.6148f, 5.7717f, 20.7607f, 6.191f, 21.3881f)
                curveTo(6.3379f, 21.6079f, 6.535f, 21.7844f, 6.7637f, 21.9008f)
                curveTo(7.4163f, 22.2331f, 8.424f, 21.7081f, 10.4393f, 20.658f)
                curveTo(11.1099f, 20.3086f, 11.4452f, 20.1339f, 11.8014f, 20.0959f)
                curveTo(11.9335f, 20.0818f, 12.0665f, 20.0818f, 12.1986f, 20.0959f)
                curveTo(12.5548f, 20.1339f, 12.8901f, 20.3086f, 13.5607f, 20.658f)
                curveTo(15.576f, 21.7081f, 16.5837f, 22.2331f, 17.2363f, 21.9008f)
                curveTo(17.465f, 21.7844f, 17.6621f, 21.6079f, 17.809f, 21.3881f)
                curveTo(18.2283f, 20.7607f, 17.9141f, 19.6148f, 17.2858f, 17.323f)
                lineTo(16.907f, 15.9414f)
                curveTo(15.5208f, 16.9231f, 13.8278f, 17.5f, 12.0f, 17.5f)
                curveTo(10.1722f, 17.5f, 8.4791f, 16.9231f, 7.093f, 15.9414f)
                close()
            }
        }
        .build()
        return _medalRibbon!!
    }

private var _medalRibbon: ImageVector? = null
