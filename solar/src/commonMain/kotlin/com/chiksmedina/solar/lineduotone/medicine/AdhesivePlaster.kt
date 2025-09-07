package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

val MedicineGroup.AdhesivePlaster: ImageVector
    get() {
        if (_adhesivePlaster != null) {
            return _adhesivePlaster!!
        }
        _adhesivePlaster = Builder(
            name = "AdhesivePlaster", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.2132f, 9.0711f)
                curveTo(1.5956f, 7.4535f, 1.5956f, 4.8308f, 3.2132f, 3.2132f)
                curveTo(4.8308f, 1.5956f, 7.4535f, 1.5956f, 9.0711f, 3.2132f)
                lineTo(20.7868f, 14.9289f)
                curveTo(22.4044f, 16.5465f, 22.4044f, 19.1692f, 20.7868f, 20.7868f)
                curveTo(19.1692f, 22.4044f, 16.5465f, 22.4044f, 14.9289f, 20.7868f)
                lineTo(3.2132f, 9.0711f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.8579f)
                lineTo(9.0711f, 20.7868f)
                curveTo(7.4535f, 22.4044f, 4.8308f, 22.4044f, 3.2132f, 20.7868f)
                curveTo(1.5956f, 19.1692f, 1.5956f, 16.5465f, 3.2132f, 14.9289f)
                lineTo(6.1421f, 12.0f)
                lineTo(12.0f, 17.8579f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.1421f)
                lineTo(14.9289f, 3.2132f)
                curveTo(16.5465f, 1.5956f, 19.1692f, 1.5956f, 20.7868f, 3.2132f)
                curveTo(22.4044f, 4.8308f, 22.4044f, 7.4535f, 20.7868f, 9.0711f)
                lineTo(17.8579f, 12.0f)
                lineTo(12.0f, 6.1421f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.8414f, 12.8715f)
                curveTo(16.149f, 13.179f, 16.149f, 13.6777f, 15.8414f, 13.9852f)
                curveTo(15.5339f, 14.2928f, 15.0353f, 14.2928f, 14.7277f, 13.9852f)
                curveTo(14.4202f, 13.6777f, 14.4202f, 13.179f, 14.7277f, 12.8715f)
                curveTo(15.0353f, 12.5639f, 15.5339f, 12.5639f, 15.8414f, 12.8715f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.129f, 9.159f)
                curveTo(11.8214f, 8.8515f, 11.3228f, 8.8515f, 11.0152f, 9.159f)
                curveTo(10.7077f, 9.4666f, 10.7077f, 9.9652f, 11.0152f, 10.2727f)
                curveTo(11.3228f, 10.5803f, 11.8214f, 10.5803f, 12.129f, 10.2727f)
                curveTo(12.4365f, 9.9652f, 12.4365f, 9.4666f, 12.129f, 9.159f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.9852f, 14.7277f)
                curveTo(14.2928f, 15.0353f, 14.2928f, 15.5339f, 13.9852f, 15.8414f)
                curveTo(13.6777f, 16.149f, 13.179f, 16.149f, 12.8715f, 15.8414f)
                curveTo(12.5639f, 15.5339f, 12.5639f, 15.0353f, 12.8715f, 14.7277f)
                curveTo(13.179f, 14.4202f, 13.6777f, 14.4202f, 13.9852f, 14.7277f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.2727f, 11.0152f)
                curveTo(9.9652f, 10.7077f, 9.4666f, 10.7077f, 9.159f, 11.0152f)
                curveTo(8.8515f, 11.3228f, 8.8515f, 11.8214f, 9.159f, 12.129f)
                curveTo(9.4666f, 12.4365f, 9.9652f, 12.4365f, 10.2727f, 12.129f)
                curveTo(10.5803f, 11.8214f, 10.5803f, 11.3228f, 10.2727f, 11.0152f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.7696f, 15.6558f)
                curveTo(17.0771f, 15.9634f, 17.0771f, 16.462f, 16.7696f, 16.7696f)
                curveTo(16.462f, 17.0771f, 15.9634f, 17.0771f, 15.6558f, 16.7696f)
                curveTo(15.3483f, 16.462f, 15.3483f, 15.9634f, 15.6558f, 15.6558f)
                curveTo(15.9634f, 15.3483f, 16.462f, 15.3483f, 16.7696f, 15.6558f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.3447f, 8.2309f)
                curveTo(9.0371f, 7.9234f, 8.5385f, 7.9234f, 8.2309f, 8.2309f)
                curveTo(7.9234f, 8.5385f, 7.9234f, 9.0371f, 8.2309f, 9.3447f)
                curveTo(8.5385f, 9.6522f, 9.0371f, 9.6522f, 9.3447f, 9.3447f)
                curveTo(9.6522f, 9.0371f, 9.6522f, 8.5385f, 9.3447f, 8.2309f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.057f, 11.9433f)
                curveTo(13.3646f, 12.2509f, 13.3646f, 12.7495f, 13.057f, 13.057f)
                curveTo(12.7495f, 13.3646f, 12.2509f, 13.3646f, 11.9433f, 13.057f)
                curveTo(11.6358f, 12.7495f, 11.6358f, 12.2509f, 11.9433f, 11.9433f)
                curveTo(12.2509f, 11.6358f, 12.7495f, 11.6358f, 13.057f, 11.9433f)
                close()
            }
        }
            .build()
        return _adhesivePlaster!!
    }

private var _adhesivePlaster: ImageVector? = null
