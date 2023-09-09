package com.chiksmedina.solar.bold.sports

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
import com.chiksmedina.solar.bold.SportsGroup

public val SportsGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 1.25f)
                curveTo(12.4144f, 1.25f, 12.7502f, 1.5858f, 12.7502f, 2.0f)
                verticalLineTo(3.0365f)
                lineTo(17.7579f, 5.5403f)
                lineTo(17.8119f, 5.5673f)
                curveTo(18.5464f, 5.9345f, 19.1724f, 6.2474f, 19.608f, 6.5515f)
                curveTo(20.0498f, 6.8598f, 20.5142f, 7.3075f, 20.5142f, 8.0f)
                curveTo(20.5142f, 8.6925f, 20.0498f, 9.1402f, 19.608f, 9.4485f)
                curveTo(19.1724f, 9.7526f, 18.5464f, 10.0655f, 17.8119f, 10.4327f)
                lineTo(12.7502f, 12.9635f)
                verticalLineTo(18.0f)
                curveTo(12.7502f, 18.4142f, 12.4144f, 18.75f, 12.0002f, 18.75f)
                curveTo(11.586f, 18.75f, 11.2502f, 18.4142f, 11.2502f, 18.0f)
                verticalLineTo(12.5162f)
                curveTo(11.2499f, 12.5058f, 11.2499f, 12.4953f, 11.2502f, 12.4849f)
                verticalLineTo(3.5151f)
                curveTo(11.2499f, 3.5047f, 11.2499f, 3.4942f, 11.2502f, 3.4838f)
                verticalLineTo(2.0f)
                curveTo(11.2502f, 1.5858f, 11.586f, 1.25f, 12.0002f, 1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 20.433f, 22.0f, 18.5f)
                curveTo(22.0f, 16.8378f, 18.6894f, 15.4462f, 14.2502f, 15.089f)
                verticalLineTo(18.0f)
                curveTo(14.2502f, 19.2426f, 13.2428f, 20.25f, 12.0002f, 20.25f)
                curveTo(10.7575f, 20.25f, 9.7502f, 19.2426f, 9.7502f, 18.0f)
                verticalLineTo(15.0889f)
                curveTo(5.3107f, 15.4462f, 2.0f, 16.8378f, 2.0f, 18.5f)
                curveTo(2.0f, 20.433f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 1.25f)
                curveTo(11.586f, 1.25f, 11.2502f, 1.5858f, 11.2502f, 2.0f)
                verticalLineTo(3.4838f)
                curveTo(11.2499f, 3.4942f, 11.2499f, 3.5047f, 11.2502f, 3.5151f)
                verticalLineTo(12.4849f)
                curveTo(11.2499f, 12.4953f, 11.2499f, 12.5058f, 11.2502f, 12.5162f)
                verticalLineTo(15.0097f)
                verticalLineTo(18.0f)
                curveTo(11.2502f, 18.4142f, 11.586f, 18.75f, 12.0002f, 18.75f)
                curveTo(12.4144f, 18.75f, 12.7502f, 18.4142f, 12.7502f, 18.0f)
                verticalLineTo(15.0097f)
                verticalLineTo(12.9635f)
                lineTo(17.8119f, 10.4327f)
                curveTo(18.5464f, 10.0655f, 19.1724f, 9.7526f, 19.608f, 9.4485f)
                curveTo(20.0498f, 9.1402f, 20.5142f, 8.6925f, 20.5142f, 8.0f)
                curveTo(20.5142f, 7.3075f, 20.0498f, 6.8598f, 19.608f, 6.5515f)
                curveTo(19.1724f, 6.2474f, 18.5464f, 5.9345f, 17.8119f, 5.5673f)
                lineTo(12.7502f, 3.0365f)
                verticalLineTo(2.0f)
                curveTo(12.7502f, 1.5858f, 12.4144f, 1.25f, 12.0002f, 1.25f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
