package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(
            name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5238f, 1.25f)
                curveTo(5.8497f, 1.25f, 1.25f, 5.8497f, 1.25f, 11.5238f)
                curveTo(1.25f, 12.201f, 1.799f, 12.75f, 2.4762f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.0f)
                curveTo(11.25f, 20.6904f, 10.6904f, 21.25f, 10.0f, 21.25f)
                curveTo(9.3096f, 21.25f, 8.75f, 20.6904f, 8.75f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(8.75f, 18.5858f, 8.4142f, 18.25f, 8.0f, 18.25f)
                curveTo(7.5858f, 18.25f, 7.25f, 18.5858f, 7.25f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(7.25f, 21.5188f, 8.4812f, 22.75f, 10.0f, 22.75f)
                curveTo(11.5188f, 22.75f, 12.75f, 21.5188f, 12.75f, 20.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(21.5238f)
                curveTo(22.201f, 12.75f, 22.75f, 12.201f, 22.75f, 11.5238f)
                curveTo(22.75f, 5.8497f, 18.1503f, 1.25f, 12.4762f, 1.25f)
                horizontalLineTo(11.5238f)
                close()
                moveTo(8.8439f, 3.1668f)
                curveTo(5.3917f, 4.273f, 2.8704f, 7.4588f, 2.7542f, 11.25f)
                horizontalLineTo(6.4154f)
                curveTo(6.5915f, 9.8077f, 6.9415f, 7.6543f, 7.6062f, 5.7375f)
                curveTo(7.925f, 4.818f, 8.3283f, 3.9167f, 8.8439f, 3.1668f)
                close()
                moveTo(7.9271f, 11.25f)
                curveTo(8.1031f, 9.8681f, 8.4334f, 7.9302f, 9.0233f, 6.229f)
                curveTo(9.3846f, 5.1873f, 9.8254f, 4.2879f, 10.3479f, 3.6617f)
                curveTo(10.8617f, 3.0459f, 11.4026f, 2.75f, 12.0f, 2.75f)
                curveTo(12.5974f, 2.75f, 13.1383f, 3.0459f, 13.6521f, 3.6617f)
                curveTo(14.1746f, 4.2879f, 14.6154f, 5.1873f, 14.9767f, 6.229f)
                curveTo(15.5666f, 7.9302f, 15.8969f, 9.8681f, 16.0729f, 11.25f)
                horizontalLineTo(7.9271f)
                close()
                moveTo(17.5846f, 11.25f)
                curveTo(17.4086f, 9.8077f, 17.0585f, 7.6543f, 16.3939f, 5.7375f)
                curveTo(16.075f, 4.818f, 15.6717f, 3.9167f, 15.1562f, 3.1668f)
                curveTo(18.6083f, 4.273f, 21.1296f, 7.4588f, 21.2458f, 11.25f)
                horizontalLineTo(17.5846f)
                close()
            }
        }
            .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
