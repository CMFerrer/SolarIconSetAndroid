package dev.chiksmedina.solar.lineduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.DesignToolsGroup

val DesignToolsGroup.RadialBlur: ImageVector
    get() {
        if (_radialBlur != null) {
            return _radialBlur!!
        }
        _radialBlur = Builder(
            name = "RadialBlur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.34f, 16.9997f)
                curveTo(6.1014f, 21.7826f, 12.2173f, 23.4214f, 17.0002f, 20.66f)
                curveTo(18.9498f, 19.5344f, 20.377f, 17.8514f, 21.1967f, 15.9286f)
                curveTo(22.388f, 13.1341f, 22.2963f, 9.833f, 20.6605f, 6.9997f)
                curveTo(19.0246f, 4.1664f, 16.2117f, 2.4364f, 13.196f, 2.0709f)
                curveTo(11.1209f, 1.8194f, 8.9498f, 2.2139f, 7.0002f, 3.3395f)
                curveTo(2.2173f, 6.1009f, 0.5785f, 12.2168f, 3.34f, 16.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 14.25f)
                curveTo(15.5f, 14.9404f, 14.9404f, 15.5f, 14.25f, 15.5f)
                curveTo(13.5596f, 15.5f, 13.0f, 14.9404f, 13.0f, 14.25f)
                curveTo(13.0f, 13.5596f, 13.5596f, 13.0f, 14.25f, 13.0f)
                curveTo(14.9404f, 13.0f, 15.5f, 13.5596f, 15.5f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 9.75f)
                curveTo(15.5f, 10.4404f, 14.9404f, 11.0f, 14.25f, 11.0f)
                curveTo(13.5596f, 11.0f, 13.0f, 10.4404f, 13.0f, 9.75f)
                curveTo(13.0f, 9.0596f, 13.5596f, 8.5f, 14.25f, 8.5f)
                curveTo(14.9404f, 8.5f, 15.5f, 9.0596f, 15.5f, 9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 14.25f)
                curveTo(11.0f, 14.9404f, 10.4404f, 15.5f, 9.75f, 15.5f)
                curveTo(9.0596f, 15.5f, 8.5f, 14.9404f, 8.5f, 14.25f)
                curveTo(8.5f, 13.5596f, 9.0596f, 13.0f, 9.75f, 13.0f)
                curveTo(10.4404f, 13.0f, 11.0f, 13.5596f, 11.0f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 9.75f)
                curveTo(11.0f, 10.4404f, 10.4404f, 11.0f, 9.75f, 11.0f)
                curveTo(9.0596f, 11.0f, 8.5f, 10.4404f, 8.5f, 9.75f)
                curveTo(8.5f, 9.0596f, 9.0596f, 8.5f, 9.75f, 8.5f)
                curveTo(10.4404f, 8.5f, 11.0f, 9.0596f, 11.0f, 9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 18.25f)
                curveTo(15.0f, 18.6642f, 14.6642f, 19.0f, 14.25f, 19.0f)
                curveTo(13.8358f, 19.0f, 13.5f, 18.6642f, 13.5f, 18.25f)
                curveTo(13.5f, 17.8358f, 13.8358f, 17.5f, 14.25f, 17.5f)
                curveTo(14.6642f, 17.5f, 15.0f, 17.8358f, 15.0f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5f, 18.25f)
                curveTo(10.5f, 18.6642f, 10.1642f, 19.0f, 9.75f, 19.0f)
                curveTo(9.3358f, 19.0f, 9.0f, 18.6642f, 9.0f, 18.25f)
                curveTo(9.0f, 17.8358f, 9.3358f, 17.5f, 9.75f, 17.5f)
                curveTo(10.1642f, 17.5f, 10.5f, 17.8358f, 10.5f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 18.25f)
                curveTo(15.0f, 18.6642f, 14.6642f, 19.0f, 14.25f, 19.0f)
                curveTo(13.8358f, 19.0f, 13.5f, 18.6642f, 13.5f, 18.25f)
                curveTo(13.5f, 17.8358f, 13.8358f, 17.5f, 14.25f, 17.5f)
                curveTo(14.6642f, 17.5f, 15.0f, 17.8358f, 15.0f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 5.75f)
                curveTo(15.0f, 6.1642f, 14.6642f, 6.5f, 14.25f, 6.5f)
                curveTo(13.8358f, 6.5f, 13.5f, 6.1642f, 13.5f, 5.75f)
                curveTo(13.5f, 5.3358f, 13.8358f, 5.0f, 14.25f, 5.0f)
                curveTo(14.6642f, 5.0f, 15.0f, 5.3358f, 15.0f, 5.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5f, 18.25f)
                curveTo(10.5f, 18.6642f, 10.1642f, 19.0f, 9.75f, 19.0f)
                curveTo(9.3358f, 19.0f, 9.0f, 18.6642f, 9.0f, 18.25f)
                curveTo(9.0f, 17.8358f, 9.3358f, 17.5f, 9.75f, 17.5f)
                curveTo(10.1642f, 17.5f, 10.5f, 17.8358f, 10.5f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5f, 5.75f)
                curveTo(10.5f, 6.1642f, 10.1642f, 6.5f, 9.75f, 6.5f)
                curveTo(9.3358f, 6.5f, 9.0f, 6.1642f, 9.0f, 5.75f)
                curveTo(9.0f, 5.3358f, 9.3358f, 5.0f, 9.75f, 5.0f)
                curveTo(10.1642f, 5.0f, 10.5f, 5.3358f, 10.5f, 5.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.25f, 9.0f)
                curveTo(18.6642f, 9.0f, 19.0f, 9.3358f, 19.0f, 9.75f)
                curveTo(19.0f, 10.1642f, 18.6642f, 10.5f, 18.25f, 10.5f)
                curveTo(17.8358f, 10.5f, 17.5f, 10.1642f, 17.5f, 9.75f)
                curveTo(17.5f, 9.3358f, 17.8358f, 9.0f, 18.25f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 9.0f)
                curveTo(6.1642f, 9.0f, 6.5f, 9.3358f, 6.5f, 9.75f)
                curveTo(6.5f, 10.1642f, 6.1642f, 10.5f, 5.75f, 10.5f)
                curveTo(5.3358f, 10.5f, 5.0f, 10.1642f, 5.0f, 9.75f)
                curveTo(5.0f, 9.3358f, 5.3358f, 9.0f, 5.75f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.25f, 13.5f)
                curveTo(18.6642f, 13.5f, 19.0f, 13.8358f, 19.0f, 14.25f)
                curveTo(19.0f, 14.6642f, 18.6642f, 15.0f, 18.25f, 15.0f)
                curveTo(17.8358f, 15.0f, 17.5f, 14.6642f, 17.5f, 14.25f)
                curveTo(17.5f, 13.8358f, 17.8358f, 13.5f, 18.25f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 13.5f)
                curveTo(6.1642f, 13.5f, 6.5f, 13.8358f, 6.5f, 14.25f)
                curveTo(6.5f, 14.6642f, 6.1642f, 15.0f, 5.75f, 15.0f)
                curveTo(5.3358f, 15.0f, 5.0f, 14.6642f, 5.0f, 14.25f)
                curveTo(5.0f, 13.8358f, 5.3358f, 13.5f, 5.75f, 13.5f)
                close()
            }
        }
            .build()
        return _radialBlur!!
    }

private var _radialBlur: ImageVector? = null
