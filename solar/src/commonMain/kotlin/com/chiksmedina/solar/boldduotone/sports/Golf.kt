package com.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(
            name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 18.5f)
                arcToRelative(10.0f, 3.5f, 0.0f, true, false, 20.0f, 0.0f)
                arcToRelative(10.0f, 3.5f, 0.0f, true, false, -20.0f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.9999f, 1.25f)
                curveTo(12.4141f, 1.25f, 12.7499f, 1.5858f, 12.7499f, 2.0f)
                verticalLineTo(3.0365f)
                lineTo(17.7577f, 5.5403f)
                lineTo(17.8117f, 5.5673f)
                curveTo(18.5461f, 5.9345f, 19.1721f, 6.2474f, 19.6078f, 6.5515f)
                curveTo(20.0495f, 6.8598f, 20.514f, 7.3075f, 20.514f, 8.0f)
                curveTo(20.514f, 8.6925f, 20.0495f, 9.1402f, 19.6078f, 9.4485f)
                curveTo(19.1721f, 9.7526f, 18.5461f, 10.0655f, 17.8117f, 10.4327f)
                lineTo(12.7499f, 12.9635f)
                verticalLineTo(18.0f)
                curveTo(12.7499f, 18.4142f, 12.4141f, 18.75f, 11.9999f, 18.75f)
                curveTo(11.5857f, 18.75f, 11.2499f, 18.4142f, 11.2499f, 18.0f)
                verticalLineTo(12.5162f)
                curveTo(11.2497f, 12.5058f, 11.2497f, 12.4953f, 11.2499f, 12.4849f)
                verticalLineTo(3.5151f)
                curveTo(11.2497f, 3.5047f, 11.2497f, 3.4942f, 11.2499f, 3.4838f)
                verticalLineTo(2.0f)
                curveTo(11.2499f, 1.5858f, 11.5857f, 1.25f, 11.9999f, 1.25f)
                close()
            }
        }
            .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
