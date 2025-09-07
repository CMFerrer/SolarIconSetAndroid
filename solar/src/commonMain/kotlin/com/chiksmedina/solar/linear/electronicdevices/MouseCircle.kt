package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.MouseCircle: ImageVector
    get() {
        if (_mouseCircle != null) {
            return _mouseCircle!!
        }
        _mouseCircle = Builder(
            name = "MouseCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 10.0f)
                curveTo(8.0f, 7.7909f, 9.7909f, 6.0f, 12.0f, 6.0f)
                curveTo(14.2091f, 6.0f, 16.0f, 7.7909f, 16.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 16.2091f, 14.2091f, 18.0f, 12.0f, 18.0f)
                curveTo(9.7909f, 18.0f, 8.0f, 16.2091f, 8.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 10.0f)
                horizontalLineTo(15.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0128f, 2.0327f)
                lineTo(9.8633f, 1.2977f)
                lineTo(9.8633f, 1.2977f)
                lineTo(10.0128f, 2.0327f)
                close()
                moveTo(16.6941f, 2.1684f)
                curveTo(16.3221f, 1.9862f, 15.8728f, 2.14f, 15.6906f, 2.512f)
                curveTo(15.5084f, 2.8839f, 15.6622f, 3.3332f, 16.0342f, 3.5154f)
                lineTo(16.6941f, 2.1684f)
                close()
                moveTo(9.8633f, 1.2977f)
                curveTo(4.9458f, 2.2975f, 1.25f, 6.6747f, 1.25f, 11.9168f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 7.3935f, 5.9381f, 3.6264f, 10.1622f, 2.7676f)
                lineTo(9.8633f, 1.2977f)
                close()
                moveTo(1.25f, 11.9168f)
                curveTo(1.25f, 17.8939f, 6.0571f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                curveTo(6.8972f, 21.25f, 2.75f, 17.0772f, 2.75f, 11.9168f)
                horizontalLineTo(1.25f)
                close()
                moveTo(12.0f, 22.75f)
                curveTo(17.9429f, 22.75f, 22.75f, 17.8939f, 22.75f, 11.9168f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 17.0772f, 17.1028f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(11.25f, 3.8502f)
                verticalLineTo(8.8918f)
                horizontalLineTo(12.75f)
                verticalLineTo(3.8502f)
                horizontalLineTo(11.25f)
                close()
                moveTo(22.75f, 11.9168f)
                curveTo(22.75f, 7.631f, 20.2798f, 3.9248f, 16.6941f, 2.1684f)
                lineTo(16.0342f, 3.5154f)
                curveTo(19.1208f, 5.0274f, 21.25f, 8.2203f, 21.25f, 11.9168f)
                horizontalLineTo(22.75f)
                close()
                moveTo(10.1622f, 2.7676f)
                curveTo(10.6697f, 2.6644f, 11.25f, 3.091f, 11.25f, 3.8502f)
                horizontalLineTo(12.75f)
                curveTo(12.75f, 2.3819f, 11.5214f, 0.9606f, 9.8633f, 1.2977f)
                lineTo(10.1622f, 2.7676f)
                close()
            }
        }
            .build()
        return _mouseCircle!!
    }

private var _mouseCircle: ImageVector? = null
