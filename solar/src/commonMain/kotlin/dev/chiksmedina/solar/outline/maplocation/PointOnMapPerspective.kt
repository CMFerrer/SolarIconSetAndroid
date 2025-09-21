package dev.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.PointOnMapPerspective: ImageVector
    get() {
        if (_pointOnMapPerspective != null) {
            return _pointOnMapPerspective!!
        }
        _pointOnMapPerspective = Builder(
            name = "PointOnMapPerspective", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 2.75f)
                curveTo(15.7574f, 2.75f, 14.75f, 3.7574f, 14.75f, 5.0f)
                curveTo(14.75f, 6.2426f, 15.7574f, 7.25f, 17.0f, 7.25f)
                curveTo(18.2426f, 7.25f, 19.25f, 6.2426f, 19.25f, 5.0f)
                curveTo(19.25f, 3.7574f, 18.2426f, 2.75f, 17.0f, 2.75f)
                close()
                moveTo(13.25f, 5.0f)
                curveTo(13.25f, 2.9289f, 14.9289f, 1.25f, 17.0f, 1.25f)
                curveTo(19.0711f, 1.25f, 20.75f, 2.9289f, 20.75f, 5.0f)
                curveTo(20.75f, 6.8142f, 19.4617f, 8.3275f, 17.75f, 8.675f)
                verticalLineTo(9.2607f)
                curveTo(18.3712f, 9.2738f, 18.9168f, 9.3027f, 19.3918f, 9.3665f)
                curveTo(20.2919f, 9.4875f, 21.0497f, 9.7464f, 21.6517f, 10.3483f)
                curveTo(22.2536f, 10.9503f, 22.5125f, 11.7081f, 22.6335f, 12.6082f)
                curveTo(22.75f, 13.4752f, 22.75f, 14.5775f, 22.75f, 15.9451f)
                verticalLineTo(16.0549f)
                curveTo(22.75f, 17.4225f, 22.75f, 18.5248f, 22.6335f, 19.3918f)
                curveTo(22.5125f, 20.2919f, 22.2536f, 21.0497f, 21.6517f, 21.6516f)
                curveTo(21.0497f, 22.2536f, 20.2919f, 22.5125f, 19.3918f, 22.6335f)
                curveTo(18.5248f, 22.75f, 17.4225f, 22.75f, 16.0549f, 22.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 22.75f, 5.4752f, 22.75f, 4.6083f, 22.6335f)
                curveTo(3.7081f, 22.5125f, 2.9503f, 22.2536f, 2.3484f, 21.6516f)
                curveTo(1.7464f, 21.0497f, 1.4875f, 20.2919f, 1.3665f, 19.3918f)
                curveTo(1.25f, 18.5248f, 1.25f, 17.4225f, 1.25f, 16.0549f)
                verticalLineTo(15.9451f)
                curveTo(1.25f, 14.5775f, 1.25f, 13.4752f, 1.3665f, 12.6082f)
                curveTo(1.4875f, 11.7081f, 1.7464f, 10.9503f, 2.3484f, 10.3484f)
                curveTo(2.9503f, 9.7464f, 3.7081f, 9.4875f, 4.6083f, 9.3665f)
                curveTo(5.4752f, 9.25f, 6.5775f, 9.25f, 7.9451f, 9.25f)
                horizontalLineTo(16.0549f)
                curveTo(16.1205f, 9.25f, 16.1856f, 9.25f, 16.25f, 9.25f)
                verticalLineTo(8.675f)
                curveTo(14.5383f, 8.3275f, 13.25f, 6.8142f, 13.25f, 5.0f)
                close()
                moveTo(16.25f, 10.75f)
                curveTo(16.1682f, 10.75f, 16.0848f, 10.75f, 16.0f, 10.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 10.75f, 5.5635f, 10.7516f, 4.8081f, 10.8531f)
                curveTo(4.6605f, 10.873f, 4.5269f, 10.8962f, 4.4053f, 10.9227f)
                lineTo(12.3532f, 15.3382f)
                curveTo(12.361f, 15.3424f, 12.3688f, 15.3467f, 12.3765f, 15.3512f)
                lineTo(20.9208f, 20.098f)
                curveTo(21.0203f, 19.869f, 21.0949f, 19.5783f, 21.1469f, 19.1919f)
                curveTo(21.2484f, 18.4365f, 21.25f, 17.4354f, 21.25f, 16.0f)
                curveTo(21.25f, 14.5646f, 21.2484f, 13.5635f, 21.1469f, 12.8081f)
                curveTo(21.0482f, 12.0743f, 20.8678f, 11.6858f, 20.591f, 11.409f)
                curveTo(20.3142f, 11.1322f, 19.9257f, 10.9518f, 19.1919f, 10.8531f)
                curveTo(18.7902f, 10.7991f, 18.319f, 10.7734f, 17.75f, 10.7611f)
                verticalLineTo(13.0f)
                curveTo(17.75f, 13.4142f, 17.4142f, 13.75f, 17.0f, 13.75f)
                curveTo(16.5858f, 13.75f, 16.25f, 13.4142f, 16.25f, 13.0f)
                verticalLineTo(10.75f)
                close()
                moveTo(19.5947f, 21.0773f)
                lineTo(12.0106f, 16.8639f)
                lineTo(4.7446f, 21.138f)
                curveTo(4.7655f, 21.141f, 4.7867f, 21.144f, 4.8081f, 21.1469f)
                curveTo(5.5635f, 21.2484f, 6.5646f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 21.25f, 18.4365f, 21.2484f, 19.1919f, 21.1469f)
                curveTo(19.3395f, 21.127f, 19.4731f, 21.1038f, 19.5947f, 21.0773f)
                close()
                moveTo(3.1898f, 20.3124f)
                lineTo(10.4891f, 16.0186f)
                lineTo(3.0792f, 11.902f)
                curveTo(2.9797f, 12.131f, 2.9051f, 12.4217f, 2.8531f, 12.8081f)
                curveTo(2.7516f, 13.5635f, 2.75f, 14.5646f, 2.75f, 16.0f)
                curveTo(2.75f, 17.4354f, 2.7516f, 18.4365f, 2.8531f, 19.1919f)
                curveTo(2.9228f, 19.7102f, 3.0333f, 20.0563f, 3.1898f, 20.3124f)
                close()
            }
        }
            .build()
        return _pointOnMapPerspective!!
    }

private var _pointOnMapPerspective: ImageVector? = null
