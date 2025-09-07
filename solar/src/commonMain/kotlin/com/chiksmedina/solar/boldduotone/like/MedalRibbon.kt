package com.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.MedalRibbon: ImageVector
    get() {
        if (_medalRibbon != null) {
            return _medalRibbon!!
        }
        _medalRibbon = Builder(
            name = "MedalRibbon", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5457f, 14.4004f)
                lineTo(7.3511f, 15.0002f)
                lineTo(6.7142f, 17.3232f)
                curveTo(6.0859f, 19.615f, 5.7717f, 20.7609f, 6.191f, 21.3883f)
                curveTo(6.3379f, 21.6081f, 6.535f, 21.7846f, 6.7637f, 21.901f)
                curveTo(7.4163f, 22.2333f, 8.424f, 21.7083f, 10.4393f, 20.6582f)
                curveTo(11.1099f, 20.3088f, 11.4452f, 20.1341f, 11.8014f, 20.0961f)
                curveTo(11.9335f, 20.082f, 12.0665f, 20.082f, 12.1986f, 20.0961f)
                curveTo(12.5548f, 20.1341f, 12.8901f, 20.3088f, 13.5607f, 20.6582f)
                curveTo(15.576f, 21.7083f, 16.5837f, 22.2333f, 17.2363f, 21.901f)
                curveTo(17.465f, 21.7846f, 17.6621f, 21.6081f, 17.809f, 21.3883f)
                curveTo(18.2283f, 20.7609f, 17.9141f, 19.615f, 17.2858f, 17.3232f)
                lineTo(16.6489f, 15.0002f)
                lineTo(16.4543f, 14.4004f)
                curveTo(15.244f, 15.3998f, 13.6921f, 16.0002f, 12.0f, 16.0002f)
                curveTo(10.3079f, 16.0002f, 8.756f, 15.3998f, 7.5457f, 14.4004f)
                close()
            }
        }
            .build()
        return _medalRibbon!!
    }

private var _medalRibbon: ImageVector? = null
