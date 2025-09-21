package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(
            name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0516f, 2.0f)
                horizontalLineTo(11.9484f)
                curveTo(10.2682f, 2.0f, 8.9373f, 2.0f, 7.8958f, 2.1425f)
                curveTo(6.8238f, 2.2891f, 5.9562f, 2.598f, 5.272f, 3.2942f)
                curveTo(4.5878f, 3.9903f, 4.2841f, 4.8731f, 4.14f, 5.9637f)
                curveTo(4.0f, 7.0234f, 4.0f, 8.3775f, 4.0f, 10.087f)
                verticalLineTo(13.9129f)
                curveTo(4.0f, 15.6225f, 4.0f, 16.9766f, 4.14f, 18.0363f)
                curveTo(4.2841f, 19.1269f, 4.5878f, 20.0097f, 5.272f, 20.7058f)
                curveTo(5.9562f, 21.402f, 6.8238f, 21.7109f, 7.8958f, 21.8575f)
                curveTo(8.9373f, 22.0f, 10.2682f, 22.0f, 11.9484f, 22.0f)
                horizontalLineTo(12.0516f)
                curveTo(13.7318f, 22.0f, 15.0627f, 22.0f, 16.1043f, 21.8575f)
                curveTo(17.1762f, 21.7109f, 18.0438f, 21.402f, 18.728f, 20.7058f)
                curveTo(19.4122f, 20.0097f, 19.7159f, 19.1269f, 19.86f, 18.0363f)
                curveTo(20.0f, 16.9766f, 20.0f, 15.6225f, 20.0f, 13.913f)
                verticalLineTo(10.0871f)
                curveTo(20.0f, 8.3775f, 20.0f, 7.0234f, 19.86f, 5.9637f)
                curveTo(19.7159f, 4.8731f, 19.4122f, 3.9903f, 18.728f, 3.2942f)
                curveTo(18.0438f, 2.598f, 17.1762f, 2.2891f, 16.1043f, 2.1425f)
                curveTo(15.0627f, 2.0f, 13.7318f, 2.0f, 12.0516f, 2.0f)
                close()
                moveTo(8.5714f, 18.5116f)
                curveTo(8.5714f, 18.1263f, 8.8784f, 17.814f, 9.2571f, 17.814f)
                horizontalLineTo(14.7429f)
                curveTo(15.1216f, 17.814f, 15.4286f, 18.1263f, 15.4286f, 18.5116f)
                curveTo(15.4286f, 18.8969f, 15.1216f, 19.2093f, 14.7429f, 19.2093f)
                horizontalLineTo(9.2571f)
                curveTo(8.8784f, 19.2093f, 8.5714f, 18.8969f, 8.5714f, 18.5116f)
                close()
            }
        }
            .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
